package com.example.clonebaemin

import android.app.Application
import android.content.Context

class Application1 : Application(){

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

    companion object{
        var appContext: Context? = null
        private set
    }
}