package com.changesoftaction.mvvm_dagger2_retrofit_app.di

import com.changesoftaction.mvvm_dagger2_retrofit_app.retrofit.ApiInterface
import com.changesoftaction.mvvm_dagger2_retrofit_app.utils.Constant
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun getRetrofit() : Retrofit {
       return Retrofit.Builder().baseUrl(Constant.BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }

    @Singleton
    @Provides
    fun getInstance(retrofit: Retrofit) : ApiInterface {
         return retrofit.create(ApiInterface::class.java)
    }

}