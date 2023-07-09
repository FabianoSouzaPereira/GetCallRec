package com.fabianospdev.getcallrec.callrecording

import android.content.Context
import android.media.MediaRecorder
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.io.IOException
import javax.inject.Inject

@AndroidEntryPoint
class CallRecordingManager @Inject constructor(private val context: Context) {
    private var mediaRecorder: MediaRecorder? = null
    private var isRecording = false

    fun startCallRecording() {
        if (isRecording) return

        val storageDirectory = context.getExternalFilesDir(null)
        val fileName = "call_recording_${System.currentTimeMillis()}.m4a"
        val outputFile = File(storageDirectory, fileName)

        mediaRecorder = MediaRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.VOICE_CALL)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
            setOutputFile(outputFile.absolutePath)

            try {
                prepare()
                start()
                isRecording = true
            } catch (e: IOException) {
                Log.e(TAG, "Failed to start call recording", e)
            }
        }
    }

    fun stopCallRecording() {
        if (!isRecording) return

        mediaRecorder?.apply {
            stop()
            release()
        }

        isRecording = false
    }

    companion object {
        private const val TAG = "CallRecordingManager"
    }
}
