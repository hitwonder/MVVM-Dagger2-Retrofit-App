package com.changesoftaction.mvvm_dagger2_retrofit_app.retrofit

import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/products")
    suspend fun getProducts(): Response<List<Products>>
}