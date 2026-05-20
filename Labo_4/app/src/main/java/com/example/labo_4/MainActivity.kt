package com.example.labo_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.labo_4.Navegacion.Nav
import com.example.labo_4.View.Greeting
import com.example.labo_4.ui.theme.Labo_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Labo_4Theme {
                Nav()
            }
        }
    }
}