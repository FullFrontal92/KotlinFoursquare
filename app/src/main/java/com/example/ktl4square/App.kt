package com.example.ktl4square

import android.app.Application
import com.parse.Parse
import com.parse.ParseACL
import com.parse.ParseUser

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("")
            .clientKey("")
            .server("")
            .build()
        )

        ParseUser.enableAutomaticUser()
        val defaultACL = ParseACL()

        defaultACL.publicReadAccess = true
        defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)

    }

}