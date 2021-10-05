package com.broniboy.chacknorrisapp.navigation

interface CoordinatorRouter {
    fun sendEvent(event: CoordinatorEvent)
}