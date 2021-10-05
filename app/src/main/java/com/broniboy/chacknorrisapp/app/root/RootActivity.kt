package com.broniboy.chacknorrisapp.app.root

import android.view.LayoutInflater
import com.broniboy.chacknorrisapp.app.base.BaseActivity
import com.broniboy.chacknorrisapp.databinding.ActivityRootBinding

class RootActivity : BaseActivity<ActivityRootBinding>() {

    override fun provideViewBinding(inflater: LayoutInflater): ActivityRootBinding =
        ActivityRootBinding.inflate(inflater)

}