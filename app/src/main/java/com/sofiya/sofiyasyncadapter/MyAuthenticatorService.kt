package com.sofiya.sofiyasyncadapter

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyAuthenticatorService : Service() {
    // Instance field that stores the authenticator object
    private lateinit var mAuthenticator: MyAuthenticator

    override fun onCreate() {
        // Create a new authenticator object
        mAuthenticator = MyAuthenticator(this)
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    override fun onBind(intent: Intent?): IBinder = mAuthenticator.iBinder
}
