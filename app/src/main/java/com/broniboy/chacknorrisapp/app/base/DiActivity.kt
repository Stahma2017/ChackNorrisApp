package com.broniboy.chacknorrisapp.app.base

import androidx.viewbinding.ViewBinding
import com.broniboy.chacknorrisapp.App
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router


abstract class DiActivity<Binding: ViewBinding> : BaseActivity<Binding>() {
    protected val appComponent = (applicationContext as App).applicationComponent

    //protected val localCicerone : Cicerone<Router>
}