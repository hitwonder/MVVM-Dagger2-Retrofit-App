package com.changesoftaction.mvvm_dagger2_retrofit_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.changesoftaction.mvvm_dagger2_retrofit_app.ui.adapter.ProductAdapter
import com.changesoftaction.mvvm_dagger2_retrofit_app.viewmodels.ProductViewModelFactory
import com.changesoftaction.mvvm_dagger2_retrofit_app.viewmodels.ProductsViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var rvProduct : RecyclerView

    private lateinit var viewModel: ProductsViewModel

    @Inject
    lateinit var productViewModelFactory: ProductViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProduct = findViewById(R.id.rvProduct)
        rvProduct.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        (application as MyApplication).applicationComponent.inject(this)

        viewModel = ViewModelProvider(this,productViewModelFactory)[ProductsViewModel::class.java]
        viewModel.liveData.observe(this) {
            rvProduct.adapter = ProductAdapter(it)

        }
    }
}