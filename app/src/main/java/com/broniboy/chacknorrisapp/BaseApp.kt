package com.broniboy.chacknorrisapp

import android.app.Application

abstract class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        lateinit var appInstance: BaseApp
            private set
    }
}