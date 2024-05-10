package com.example.dikidimainscreen.navigation

import com.google.gson.Gson

sealed class Screen(
    val route: String
) {
    object Home : Screen(ROUTE_HOME)
    object Catalog : Screen(ROUTE_CATALOG)
    object Promo : Screen(ROUTE_PROMO)
    object Profile : Screen(ROUTE_PROFILE)
    object Menu : Screen(ROUTE_MENU) {

    }

    companion object {

        const val ROUTE_HOME = "home"
        const val ROUTE_CATALOG = "catalog"
        const val ROUTE_PROMO = "promo"
        const val ROUTE_PROFILE = "profile"
        const val ROUTE_MENU = "menu"

    }
}