package com.fabianospdev.getcallrec.sevices

import android.Manifest.permission.RECORD_AUDIO
import android.content.pm.PackageManager
import android.telecom.Call
import android.telecom.CallScreeningService
import androidx.core.content.ContextCompat
import com.fabianospdev.getcallrec.callrecording.CallRecordingManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CallScreeningService : CallScreeningService(){
    @Inject
    lateinit var callRecordingManager: CallRecordingManager

    override fun onScreenCall(callDetails: Call.Details) {
        val hasCallRecordingPermission = ContextCompat.checkSelfPermission(
            this,
            RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED

        if (hasCallRecordingPermission) {
            if (callDetails.callerDisplayNamePresentation == 1) {
                val response = CallScreeningService.CallResponse.Builder()
                    .setDisallowCall(false)
                    .setRejectCall(false)
                    .setSilenceCall(false)
                    .setSkipCallLog(false)
                    .setSkipNotification(false)
                    .build()

                respondToCall(callDetails, response)

                callRecordingManager.startCallRecording()
            } else {
                // Handle blocked or restricted numbers here
            }
        } else {
            // Handle missing recording permission here
        }
    }
    
}