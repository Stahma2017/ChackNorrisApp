package com.broniboy.chacknorrisapp.app.jokes

import android.view.LayoutInflater
import android.view.ViewGroup
import com.broniboy.chacknorrisapp.app.base.BaseFragment
import com.broniboy.chacknorrisapp.databinding.FragmentJokesBinding

class JokesFragment: BaseFragment<FragmentJokesBinding>() {

    override fun provideViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentJokesBinding = FragmentJokesBinding.inflate(inflater, container, false)
}