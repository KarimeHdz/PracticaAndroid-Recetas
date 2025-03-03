package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecipeView4(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Receta 4 - Cheesecake de Mango", style = MaterialTheme.typography.headlineMedium)
        Text("Forma la base\n" +
                "1.Forra la base de un aro para pastelería con papel aluminio, la orilla con acetato y colócalo en una charola. Mezcla las galletas con la mantequilla; vierte la mezcla anterior en la base del aro, cubre el fondo hasta formar una base y refrigera por 15 minutos.\n" +
                "Mezcla\n" +
                "2.Para el relleno, bate el queso crema hasta acremar, agrega la Leche Condensada LA LECHERA® y sin dejar de batir, añade 1 ½ sobres de grenetina previamente disuelta y vierte sobre la base de galleta. Deja reposar a temperatura ambiente de 10 a 15 minutos, sin dejar cuajar por completo.\n" +
                "Refrigera\n" +
                "3.Para el relleno de mango, licúa 1 taza mango con el azúcar y sin dejar de licuar agrega 1 ½ sobres de grenetina previamente disuelta. Cuando el relleno comience a cuajar vierte el relleno de mango poco a poco y con un palillo mezcla ligeramente. Refrigera por 2 horas, desmolda y decora con ½ taza de mango y un poco de menta. Ofrece.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}