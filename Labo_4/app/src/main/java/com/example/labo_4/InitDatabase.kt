package com.example.labo_4

import android.app.Application
import androidx.room.Room
import com.example.labo_4.Model.AppDatabase

class InitDatabase : Application() {
    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "task_database"
        )
            .fallbackToDestructiveMigration(false)
            .build()
    }
}