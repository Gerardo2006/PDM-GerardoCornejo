package com.example.labo_4.Model.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val endDate: Long = System.currentTimeMillis(),
    val isCompleted: Boolean = false
)