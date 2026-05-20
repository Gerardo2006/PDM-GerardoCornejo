package com.example.labo_4.Navegacion

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.labo_4.View.Greeting
import com.example.labo_4.View.Inicio
import com.example.labo_4.ViewModel.GeneralViewModel

@Composable
fun Nav() {
    val navController = rememberNavController()
    val viewModel: GeneralViewModel = viewModel()

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
