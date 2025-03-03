package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecipeView1(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Receta 1 - Ensalada de Atún c/verduras", style = MaterialTheme.typography.headlineMedium)
        Text("Mezcla\n" +
                "1.Mezcla la Media Crema NESTLÉ® con la mayonesa, la sal, el jugo de limón, los jitomates, la cebolla, el pepino, el atún, el cilantro y el chile serrano.\n" +
                "Acompaña\n" +
                "2.Sirve y acompaña con galletas saladas.\n" +
                "Sirve\n" +
                "3.Disfruta.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}