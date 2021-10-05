package com.broniboy.chacknorrisapp.di.component

import com.broniboy.chacknorrisapp.di.module.NavigationModule
import com.broniboy.chacknorrisapp.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, NavigationModule::class])
interface ApplicationComponent {

}