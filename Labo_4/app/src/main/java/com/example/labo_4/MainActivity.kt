package com.example.labo_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.labo_4.Navegacion.Nav
import com.example.labo_4.ViewModel.TaskViewModel
import com.example.labo_4.ui.theme.Labo_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val taskViewModel = TaskViewModel(InitDatabase.database.taskDao())

        setContent {
            Labo_4Theme {
                Nav(viewModel = taskViewModel)
            }
        }
    }
}