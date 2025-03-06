package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicaandroid.R

@Composable
fun RecipeView2(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFFFEBEE))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.pollo),
            contentDescription = "Pechuga con Crema de Chipotle",
            modifier = Modifier
                .size(220.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "🍗 Pechuga c/ Crema de Chipotle",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFD32F2F)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = """
                🔥 Licúa:
                1. Licúa la Leche Evaporada CARNATION® CLAVEL®, la Media Crema NESTLÉ®, 
                   el queso crema, el agua, el consomé de pollo, la sal con ajo y el chile chipotle.
                
                🍅 Cocina:
                2. Calienta el puré de tomate hasta que cambie de color, agrega lo que licuaste 
                   y cocina hasta que espese ligeramente moviendo constantemente para evitar que se pegue.
                
                🍽️ Agrega salsa sobre el pollo:
                3. Sirve las supremas de pollo con la salsa y decora con el perejil. ¡Disfruta!
            """.trimIndent(),
            fontSize = 18.sp,
            color = Color(0xFF4E342E)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.popBackStack() },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD32F2F))
        ) {
            Text(text = "⬅ Volver", fontSize = 18.sp, color = Color.White)
        }
    }
}
