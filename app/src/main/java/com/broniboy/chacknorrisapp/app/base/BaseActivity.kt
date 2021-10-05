package com.broniboy.chacknorrisapp.app.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.FragmentActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<Binding: ViewBinding> : FragmentActivity() {

    protected lateinit var binding: Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = provideViewBinding(layoutInflater)
        val view = binding.root
        setContentView(view)
        prepareUi()
    }

    abstract fun provideViewBinding(inflater: LayoutInflater): Binding
    open fun prepareUi() = Unit
}