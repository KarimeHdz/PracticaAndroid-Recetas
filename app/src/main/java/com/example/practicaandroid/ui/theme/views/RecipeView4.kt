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
fun RecipeView4(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFFFF3E0))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.cheesecake),
            contentDescription = "Cheesecake de Mango",
            modifier = Modifier
                .size(220.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "🍰 Cheesecake de Mango 🥭",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9800)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = """
                🍪 **Forma la base:**
                1. Forra la base de un aro para pastelería con papel aluminio y la orilla con acetato.
                2. Mezcla las galletas con la mantequilla y cubre el fondo del aro. 
                3. Refrigera por **15 minutos**.
                
                🧀 **Mezcla el relleno:**
                4. Bate el queso crema hasta acremar.
                5. Agrega la Leche Condensada LA LECHERA® y la grenetina disuelta.
                6. Vierte la mezcla sobre la base de galleta y deja reposar por **10-15 minutos**.
                
                🥭 **Prepara la capa de mango:**
                7. Licúa 1 taza de mango con azúcar y agrega la grenetina disuelta.
                8. Cuando comience a cuajar, vierte poco a poco sobre el relleno y mezcla ligeramente con un palillo.
                9. Refrigera por **2 horas**, desmolda y decora con **mango y hojas de menta**. ¡Disfruta!
            """.trimIndent(),
            fontSize = 18.sp,
            color = Color(0xFF6D4C41)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.popBackStack() },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9800))
        ) {
            Text(text = "⬅ Volver", fontSize = 18.sp, color = Color.White)
        }
    }
}
