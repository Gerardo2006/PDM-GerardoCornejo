package com.example.labo_6.Data.remote

import com.example.labo_6.Data.model.MealResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search.php")
    suspend fun getMeals(@Query("s") query: String = ""): MealResponse
}