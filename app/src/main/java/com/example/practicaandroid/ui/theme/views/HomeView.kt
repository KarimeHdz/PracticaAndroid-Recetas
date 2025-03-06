package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicaandroid.R

data class Recipe(val id: String, val title: String, val imageRes: Int)

@Composable
fun HomeView(navController: NavController) {
    val recipes = listOf(
        Recipe("recipe1", "Receta de Atún", R.drawable.atun),
        Recipe("recipe2", "Pollo a la Parrilla", R.drawable.pollo),
        Recipe("recipe3", "Brownie de Chocolate", R.drawable.brownie),
        Recipe("recipe4", "Cheesecake de Fresa", R.drawable.cheesecake)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE1BEE7)) // Fondo lila pastel
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "🍽️ Recetas 🍽️",
            fontSize = 38.sp, // Aumentamos el tamaño
            color = Color(0xFF6A1B9A), // Morado oscuro
            fontFamily = FontFamily.SansSerif, // Letra más elegante
            fontWeight = FontWeight.Bold // Negrita para destacar
        )

        Spacer(modifier = Modifier.height(24.dp))

        LazyColumn {
            items(recipes.size) { index ->
                RecipeCard(recipe = recipes[index], navController)
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun RecipeCard(recipe: Recipe, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .height(160.dp) // Ajustamos la altura para que la imagen quepa bien
            .clickable { navController.navigate(recipe.id) },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF8BBD0), // Rosa pastel
            contentColor = Color(0xFF6A1B9A) // Texto en morado oscuro
        ),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp), // Un poco más de espacio
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = recipe.title,
                modifier = Modifier
                    .size(148.dp) // Aumentamos el tamaño de la imagen
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = recipe.title,
                fontSize = 20.sp, // También agrandamos el texto para equilibrar
                color = Color(0xFF6A1B9A), // Morado oscuro
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

