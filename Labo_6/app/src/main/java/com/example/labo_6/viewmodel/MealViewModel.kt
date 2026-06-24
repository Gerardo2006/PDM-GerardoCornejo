package com.example.labo_6.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.labo_6.Data.model.Meal
import com.example.labo_6.Data.remote.RetrofitInstance
import kotlinx.coroutines.launch
import java.io.IOException

class MealViewModel : ViewModel() {

    var meals by mutableStateOf<List<Meal>>(emptyList())
        private set

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    init {
        loadMeals()
    }

    fun loadMeals() {
        viewModelScope.launch {
            isLoading = true
            errorMessage = null
            try {
                meals = RetrofitInstance.api.getMeals().meals
            } catch (e: IOException) {
                errorMessage = "Sin conexión a Internet"
            } catch (e: Exception) {
                errorMessage = "Error inesperado: ${e.message}"
            } finally {
                isLoading = false
            }
        }
    }
}