package com.example.gcodos.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gcodos.Pantallas.Inicio
import com.example.gcodos.Pantallas.Lista
import com.example.gcodos.Pantallas.UseSensorScreen

@Composable
fun Nav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Inicio"
    ) {
        composable("Inicio") {
            Inicio(navController)
        }

        composable("Lista") {
            Lista(navController)
        }

        composable("UseSensor") {
            UseSensorScreen(navController)
        }
    }
}
