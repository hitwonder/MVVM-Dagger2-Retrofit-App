package com.changesoftaction.mvvm_dagger2_retrofit_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import dagger.Provides

@Entity
data class Products(
    val category: String,
    val description: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)