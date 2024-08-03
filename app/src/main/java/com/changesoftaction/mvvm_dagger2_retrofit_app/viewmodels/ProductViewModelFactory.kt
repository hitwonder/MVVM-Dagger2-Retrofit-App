package com.changesoftaction.mvvm_dagger2_retrofit_app.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.changesoftaction.mvvm_dagger2_retrofit_app.respository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(private val productRepository: ProductRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductsViewModel(productRepository) as T
    }

}