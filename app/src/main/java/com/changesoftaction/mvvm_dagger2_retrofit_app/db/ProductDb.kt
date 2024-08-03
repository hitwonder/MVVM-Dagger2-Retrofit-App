package com.changesoftaction.mvvm_dagger2_retrofit_app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products

@Database(entities = [Products::class], version = 3)
abstract class ProductDb : RoomDatabase() {

     abstract fun productDao() : ProductsDAO


}