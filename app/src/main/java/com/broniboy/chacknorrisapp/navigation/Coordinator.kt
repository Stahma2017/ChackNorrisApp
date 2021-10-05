package com.broniboy.chacknorrisapp.navigation

interface Coordinator {
    fun consumeEvent(event: CoordinatorEvent)
}