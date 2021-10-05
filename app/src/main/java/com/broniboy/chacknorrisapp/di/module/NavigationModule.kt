package com.broniboy.chacknorrisapp.di.module

import com.broniboy.chacknorrisapp.navigation.CoordinatorHolder
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import javax.inject.Singleton

@Module
class NavigationModule {
    @Singleton
    @Provides
    fun provideCicerone() : Cicerone<Router> =
        Cicerone.create()

    @Singleton
    @Provides
    fun provideCoordinatorHolder() : CoordinatorHolder =
        CoordinatorHolder()
}