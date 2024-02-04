package com.example.fishcardapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FlashCardsNavigationGraph(){
    val navControler = rememberNavController()

    NavHost(navController = navControler, startDestination = Routes.MENU_SCREEN){
        composable(Routes.MENU_SCREEN){
            MenuScreen()
        }
    }


}