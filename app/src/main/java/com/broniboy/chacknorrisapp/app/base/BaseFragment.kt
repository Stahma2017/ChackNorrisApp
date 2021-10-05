package com.broniboy.chacknorrisapp.app.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding> : Fragment() {

    protected var _binding: Binding? = null
    protected val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = provideViewBinding(inflater, container)
        val view = binding.root
        prepareUi(savedInstanceState)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    open fun prepareUi(savedInstanceState: Bundle?) = Unit
    abstract fun provideViewBinding(inflater: LayoutInflater, container: ViewGroup?): Binding
}