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
fun RecipeView3(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFD7CCC8))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.brownie),
            contentDescription = "Brownie CARLOS V",
            modifier = Modifier
                .size(220.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "🍫 Brownie CARLOS V",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4E342E)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = """
                🔥 Mezcla:
                1. Precalienta el horno a 180°C.
                2. Mezcla ¾ de taza de cocoa con los huevos, 2 barras de mantequilla, 
                   1¼ tazas de azúcar y la harina hasta integrar completamente.
                
                🍪 Hornea:
                3. Vierte la mezcla en un molde para pastel previamente engrasado y enharinado. 
                   Coloca encima 4 barras de Chocolate CARLOS V® troceadas. 
                   Hornea a 180°C durante 35 minutos o hasta que el centro esté firme. 
                   Retira del horno, deja enfriar y desmolda.
                
                🎂 Decora:
                4. Para la crema de chocolate, bate ½ taza de cocoa con ½ taza de azúcar 
                   y 2 barras de mantequilla hasta integrar. Usa una manga pastelera para decorar 
                   el pastel y añade 2 barras de Chocolate CARLOS V®. ¡Disfruta!
            """.trimIndent(),
            fontSize = 18.sp,
            color = Color(0xFF5D4037)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.popBackStack() },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4E342E))
        ) {
            Text(text = "⬅ Volver", fontSize = 18.sp, color = Color.White)
        }
    }
}
