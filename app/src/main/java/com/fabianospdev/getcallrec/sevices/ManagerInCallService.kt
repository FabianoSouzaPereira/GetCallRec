package com.fabianospdev.getcallrec.sevices

import android.telecom.Call
import android.telecom.InCallService
import com.fabianospdev.getcallrec.callrecording.CallRecordingManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ManagerInCallService : InCallService() {
    @Inject
    lateinit var callRecordingManager: CallRecordingManager

    override fun onCallAdded(call: Call) {
        super.onCallAdded(call)

        // Handle incoming and outgoing calls here
    }

    override fun onCallRemoved(call: Call) {
        super.onCallRemoved(call)

        callRecordingManager.stopCallRecording()
    }
}