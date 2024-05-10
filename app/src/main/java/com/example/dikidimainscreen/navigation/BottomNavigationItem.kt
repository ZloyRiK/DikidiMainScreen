package com.example.dikidimainscreen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(
    val screen: Screen,
    val icon: ImageVector,
    val label: String
) {

    object Home: BottomNavigationItem(
        screen = Screen.Home,
        icon = Icons.Outlined.Home,
        label = "Главная"
    )
    object Catalog: BottomNavigationItem(
        screen = Screen.Catalog,
        icon = Icons.Outlined.List,
        label = "Каталог"
    )
    object Promo: BottomNavigationItem(
        screen = Screen.Promo,
        icon = Icons.Outlined.Star,
        label = "Акции"
    )
    object Profile: BottomNavigationItem(
        screen = Screen.Profile,
        icon = Icons.Outlined.AccountCircle,
        label = "Мои записи"
    )
    object Menu: BottomNavigationItem(
        screen = Screen.Menu,
        icon = Icons.Outlined.Menu,
        label = "Еще"
    )
}