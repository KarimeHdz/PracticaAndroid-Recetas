package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecipeView2(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Receta 2 - Pechuga c/crema de chipotle", style = MaterialTheme.typography.headlineMedium)
        Text("1.Licúa la Leche Evaporada CARNATION® CLAVEL® Reducida en Grasa*, la Media Crema NESTLÉ® Reducida en Grasa**, el queso crema, el agua, el consomé de pollo, la sal con ajo y el chile chipotle.\n" +
                "Cocina\n" +
                "2.Calienta el puré de tomate hasta que cambie de color, agrega lo que licuaste y cocina hasta que espese ligeramente moviendo constantemente para evitar que se pegue.\n" +
                "Agrega salsa sobre el pollo\n" +
                "3.Sirve las supremas de pollo con la salsa y decora con el perejil. Ofrece.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}