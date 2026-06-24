package com.example.labo_6.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.labo_6.ui.theme.Labo_6Theme
import com.example.labo_6.viewmodel.MealViewModel

@Composable
fun MealScreen(viewModel: MealViewModel = viewModel()) {

    LaunchedEffect(Unit) {
        viewModel.loadMeals()
    }

    when {
        viewModel.isLoading -> {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        viewModel.errorMessage != null -> {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = viewModel.errorMessage ?: "Error")
            }
        }

        else -> {
            LazyColumn {
                items(viewModel.meals) { meal ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                            .padding(8.dp)
                        ) {
                            AsyncImage(
                                model = meal.strMealThumb,
                                contentDescription = meal.strMeal,
                                modifier = Modifier.size(80.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(12.dp)
                            )
                            Column {
                                Text(
                                    text = meal.strMeal,
                                    style = MaterialTheme.typography.titleMedium
                                )
                                Text(text = "Categoría: ${meal.strCategory}")
                                Text(text = "País: ${meal.strArea}")
                            }
                        }
                    }
                }
            }
        }
    }
}