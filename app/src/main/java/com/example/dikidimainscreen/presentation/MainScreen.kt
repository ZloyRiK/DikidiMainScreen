package com.example.dikidimainscreen.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dikidimainscreen.navigation.AppNavGraph
import com.example.dikidimainscreen.navigation.BottomNavigationItem
import com.example.dikidimainscreen.navigation.Screen
import com.example.dikidimainscreen.navigation.rememberNavState

//@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navigationState = rememberNavState()


    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "Онлайн-запись",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "City name", fontSize = 18.sp)
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
        bottomBar = {
            val navBackStackEntry by navigationState.navHostController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            NavigationBar {
                val items = listOf(
                    BottomNavigationItem.Home,
                    BottomNavigationItem.Catalog,
                    BottomNavigationItem.Promo,
                    BottomNavigationItem.Profile,
                    BottomNavigationItem.Menu
                )
                Row(horizontalArrangement = Arrangement.Center) {
                    items.forEach {
                        NavigationRailItem(
                            selected = currentRoute == it.screen.route,
                            onClick = { navigationState.navigateTo(it.screen.route) },
                            icon = { Icon(it.icon, contentDescription = it.label) },
                            label = { Text(text = it.label) })
                    }
                }
            }
        }
    ) {
        AppNavGraph(
            navController = navigationState.navHostController,
            homeScreenContent = { HomeScreen( paddingValues = it) },
            catalogScreenContent = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Catalog page")
                }
            },
            promoScreenContent = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Promo page")
                }
            },
            profileScreenContent = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Profile page")
                }
            },
            menuScreenContent = {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Menu page")
                }
            })

    }
}