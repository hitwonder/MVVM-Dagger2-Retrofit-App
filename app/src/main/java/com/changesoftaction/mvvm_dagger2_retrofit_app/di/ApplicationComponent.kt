package com.changesoftaction.mvvm_dagger2_retrofit_app.di

import com.changesoftaction.mvvm_dagger2_retrofit_app.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}