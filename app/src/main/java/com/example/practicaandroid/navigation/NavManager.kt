package com.example.practicaandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.practicaandroid.ui.theme.views.HomeView
import com.example.practicaandroid.ui.theme.views.RecipeView1
import com.example.practicaandroid.ui.theme.views.RecipeView2
import com.example.practicaandroid.ui.theme.views.RecipeView3
import com.example.practicaandroid.ui.theme.views.RecipeView4

@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeView(navController) }
        composable("recipe1") { RecipeView1(navController) }
        composable("recipe2") { RecipeView2(navController) }
        composable("recipe3") { RecipeView3(navController) }
        composable("recipe4") { RecipeView4(navController) }
    }
}