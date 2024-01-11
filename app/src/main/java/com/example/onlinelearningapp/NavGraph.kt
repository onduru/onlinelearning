package com.example.onlinelearningapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LandingScreen" ){

        composable(route = "LandingScreen"){
            LandingScreen(navController)
        }

        composable(route = "LoginScreen"){
            LoginScreen(navController)
        }

        composable(route ="StartScreen" ){
            StartScreen(navController)
        }

    }


}