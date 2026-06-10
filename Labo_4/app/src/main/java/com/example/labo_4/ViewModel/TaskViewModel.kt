package com.example.labo_4.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.labo_4.Model.Entities.Task
import com.example.labo_4.Model.TaskDAO
import kotlinx.coroutines.launch

class TaskViewModel(private val dao: TaskDAO) : ViewModel() {
    val tasks = dao.getAllTasks()

    fun addTask(task: Task) {
        viewModelScope.launch {
            dao.insertTask(task)
        }
    }

}