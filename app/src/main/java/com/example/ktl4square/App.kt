package com.example.ktl4square

import android.app.Application
import com.parse.Parse
import com.parse.ParseACL
import com.parse.ParseUser

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("8961e87f9e6f81a37c560fa3d3ff259e63451dcd")
            .clientKey("dd873d8bf3bf5a62dab25241182a4d3f58bca6af")
            .server("http://52.15.240.161:80/parse")
            .build()
        )

        ParseUser.enableAutomaticUser()
        val defaultACL = ParseACL()

        defaultACL.publicReadAccess = true
        defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)

    }

}