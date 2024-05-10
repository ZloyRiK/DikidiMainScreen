package com.example.dikidimainscreen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class NavigationState(val navHostController: NavHostController) {

    fun navigateTo(route: String){
        navHostController.navigate(route) {
            launchSingleTop =
                true // Чтобы один экран не пересоздавался повторно при попытке открыть его несколько раз подряд
//                            popUpTo(items.first().screen.route)
            popUpTo(navHostController.graph.startDestinationId) {
                saveState = true
            }
            restoreState = true
        }
    }
}

@Composable
fun rememberNavState(navHostController: NavHostController = rememberNavController()): NavigationState{
    return remember {
        NavigationState(navHostController)
    }
}