package com.changesoftaction.mvvm_dagger2_retrofit_app.model

data class Products(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)