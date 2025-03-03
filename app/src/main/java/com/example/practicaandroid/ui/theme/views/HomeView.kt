package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeView(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Recetas", style = MaterialTheme.typography.headlineMedium)

        Button(onClick = { navController.navigate("recipe1") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text("Receta 1")
        }
        Button(onClick = { navController.navigate("recipe2") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text("Receta 2")
        }
        Button(onClick = { navController.navigate("recipe3") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text("Receta 3")
        }
        Button(onClick = { navController.navigate("recipe4") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text("Receta 4")
        }
    }
}