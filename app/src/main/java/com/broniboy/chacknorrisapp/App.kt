package com.broniboy.chacknorrisapp

import com.broniboy.chacknorrisapp.di.component.ApplicationComponent
import com.broniboy.chacknorrisapp.di.component.DaggerApplicationComponent

class App: BaseApp() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }

}