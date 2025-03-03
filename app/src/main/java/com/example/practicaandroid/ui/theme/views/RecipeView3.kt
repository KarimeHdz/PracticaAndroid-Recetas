package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecipeView3(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Receta 3 - Brownie CARLOS V", style = MaterialTheme.typography.headlineMedium)
        Text("Mezcla\n" +
                "1.Horno precalentado a 180 °C.\n" +
                "2.Mezcla ¾ de taza de cocoa con los huevos, 2 barras de mantequilla, 1 ¼ tazas de azúcar y la harina hasta integrar por completo.\n" +
                "Hornea\n" +
                "3.Vierte la mezcla en un molde para pastel previamente engrasado y enharinado; coloca encima 4 barras de Chocolate con Leche CARLOS V® troceadas. Hornea a 180 °C durante 35 minutos o hasta que el centro esté firme, retira del horno, deja enfriar y desmolda.\n" +
                "Decora\n" +
                "4.Para la crema de chocolate, bate ½ taza de cocoa con ½ taza de azúcar y 2 barras de mantequilla hasta integrar; coloca la crema en una manga pastelera con duya y decora el pastel. Coloca 2 barras de Chocolate con Leche CARLOS V® y ofrece.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}