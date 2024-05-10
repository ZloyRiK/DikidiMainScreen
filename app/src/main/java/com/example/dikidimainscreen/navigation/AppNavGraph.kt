package com.example.dikidimainscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navController: NavHostController,
    homeScreenContent: @Composable () -> Unit,
    catalogScreenContent: @Composable () -> Unit,
    promoScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit,
    menuScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            homeScreenContent()
        }
        composable(Screen.Catalog.route) {
            catalogScreenContent()
        }
        composable(Screen.Promo.route) {
            promoScreenContent()
        }
        composable(Screen.Profile.route) {
            profileScreenContent()
        }
        composable(Screen.Menu.route) {
            menuScreenContent()
        }
    }
}