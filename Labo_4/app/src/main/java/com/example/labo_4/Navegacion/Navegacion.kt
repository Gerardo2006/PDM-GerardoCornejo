package com.example.labo_4.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.labo_4.View.Greeting
import com.example.labo_4.View.Inicio
import com.example.labo_4.ViewModel.TaskViewModel

@Composable
fun Nav(viewModel: TaskViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Inicio"
    ) {
        composable("Greeting") {
            Greeting(navController, viewModel = viewModel)
        }

        composable("Inicio") {
            Inicio(navController, viewModel = viewModel)
        }
    }
}