package com.broniboy.chacknorrisapp.app.joke

import android.view.LayoutInflater
import android.view.ViewGroup
import com.broniboy.chacknorrisapp.app.base.BaseFragment
import com.broniboy.chacknorrisapp.databinding.FragmentJokeBinding

class JokeFragment: BaseFragment<FragmentJokeBinding>() {

    override fun provideViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentJokeBinding = FragmentJokeBinding.inflate(inflater, container, false)

}