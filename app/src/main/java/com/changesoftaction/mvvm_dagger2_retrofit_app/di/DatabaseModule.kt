package com.changesoftaction.mvvm_dagger2_retrofit_app.di

import android.content.Context
import androidx.room.Room
import com.changesoftaction.mvvm_dagger2_retrofit_app.db.ProductDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabaseInstance(context: Context): ProductDb {
        return Room.databaseBuilder(context, ProductDb::class.java, "Products").fallbackToDestructiveMigration().build()
    }
}