package com.changesoftaction.mvvm_dagger2_retrofit_app.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products

@Dao
interface ProductsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(products: List<Products>)

    @Query("Select * from Products")
    suspend fun getProducts() : List<Products>
}