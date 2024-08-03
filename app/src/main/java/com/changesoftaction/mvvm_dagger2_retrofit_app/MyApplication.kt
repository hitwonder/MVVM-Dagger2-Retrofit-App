package com.changesoftaction.mvvm_dagger2_retrofit_app

import android.app.Application
import com.changesoftaction.mvvm_dagger2_retrofit_app.di.ApplicationComponent
import com.changesoftaction.mvvm_dagger2_retrofit_app.di.DaggerApplicationComponent

class MyApplication : Application() {

     lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}