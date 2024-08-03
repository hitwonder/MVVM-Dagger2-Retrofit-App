package com.changesoftaction.mvvm_dagger2_retrofit_app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products
import com.changesoftaction.mvvm_dagger2_retrofit_app.respository.ProductRepository
import kotlinx.coroutines.launch

class ProductsViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val liveData: LiveData<List<Products>>
        get() = productRepository.liveData

    init {

        viewModelScope.launch {
            productRepository.getProducts()

        }

    }

}