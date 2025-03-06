package com.example.practicaandroid.ui.theme.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
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
fun RecipeView1(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFF8BBD0))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.atun),
            contentDescription = "Ensalada de Atún con verduras",
            modifier = Modifier
                .size(220.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "🥗 Ensalada de Atún con Verduras",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = """
                Ingredientes:
                1. 1 envase de media crema NESTLE deslactosada (190 g)
                2. 1/2 taza de mayonesa
                3. 1/2 cucharadita de sal
                4. 1 limón
                5. 4 jitomates en cubos
                6. 1/4 pieza de cebolla
                7. 1 pepino
                8. 3 latas de atún 
                9. 7 ramitas de cilantro
                10. 1 chile serrano
                11. 1 paquete de galletas saladas
                
                Mezcla:
                1. Mezcla la Media Crema NESTLÉ® con la mayonesa, la sal, el jugo de limón, 
                   los jitomates, la cebolla, el pepino, el atún, el cilantro y el chile serrano.
                
                Acompaña:
                2. Sirve y acompaña con galletas saladas.
                
                Sirve:
                3. ¡Disfruta tu deliciosa ensalada!
            """.trimIndent(),
            fontSize = 18.sp,
            color = Color(0xFF4E342E)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.popBackStack() },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD81B60))
        ) {
            Text(text = "⬅ Volver", fontSize = 18.sp, color = Color.White)
        }
    }
}
