package com.changesoftaction.mvvm_dagger2_retrofit_app.respository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.changesoftaction.mvvm_dagger2_retrofit_app.db.ProductDb
import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products
import com.changesoftaction.mvvm_dagger2_retrofit_app.retrofit.ApiInterface
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiInterface: ApiInterface,private val productDb: ProductDb) {

    private val mutableLiveData = MutableLiveData<List<Products>>()
    val liveData : LiveData<List<Products>>
        get() = mutableLiveData

    suspend fun getProducts() {
        val result = apiInterface.getProducts()
        if (result.isSuccessful && result.body() != null) {
            productDb.productDao().insert(result.body()!!)
            mutableLiveData.postValue(result.body())
        }
    }


}