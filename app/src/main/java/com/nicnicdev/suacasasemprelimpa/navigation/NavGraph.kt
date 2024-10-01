package com.nicnicdev.suacasasemprelimpa.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.nicnicdev.suacasasemprelimpa.screens.RegisterScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nicnicdev.suacasasemprelimpa.MyFirstScreen

// Definição das rotas da navegação
sealed class Screen(val route: String) {
    object Main : Screen("main_screen")
    object Register : Screen("register_screen")
}
@Composable
fun SetupNavGraph(navController: NavHostController ) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route // Definindo a primeira tela
    ) {
        composable(route = Screen.Main.route) {
            MyFirstScreen(navController = navController) // tela principal com navegação
        }
        composable(route = Screen.Register.route) {
            RegisterScreen (navController = navController) //tela de cadastro
        }

    }
}