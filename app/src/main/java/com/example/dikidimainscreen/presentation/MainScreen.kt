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
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.dikidimainscreen.navigation.BottomNavigationItem
import com.example.dikidimainscreen.navigation.rememberNavState

//@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainScreenViewModel) {
    val navigationState = rememberNavState()
    val selectedNavItem = viewModel.selectedNavItem.observeAsState(BottomNavigationItem.Home)


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
                            selected = selectedNavItem == it,
                            onClick = { viewModel.selectNavItem(it) },
                            icon = { Icon(it.icon, contentDescription = it.label) },
                            label = { Text(text = it.label) })
                    }
                }
            }
        }
    ) {
        when (selectedNavItem.value) {

            BottomNavigationItem.Home -> {
                HomeScreen(viewModel = viewModel, paddingValues = it)
            }

            BottomNavigationItem.Catalog -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Catalog page")
                }

            }

            BottomNavigationItem.Promo -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Promo page")
                }

            }

            BottomNavigationItem.Profile -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Profile page")
                }

            }

            BottomNavigationItem.Menu -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                Text(text = "Menu page")
                }
            }
        }
    }

//    Scaffold(
//        bottomBar = {
//            NavigationBar {
//                val navBackStackEntry = navigationState.navHostController.currentBackStackEntryAsState()
//                val currentRoute = navBackStackEntry.value?.destination?.route
//                val items =
//                    listOf(NavigationItem.Home, NavigationItem.Favorite, NavigationItem.Profile)
//                items.forEach { item ->
//                    NavigationBarItem(
//                        icon = { Icon(item.imageVector, contentDescription = null) },
//                        label = { Text(text = stringResource(id = item.titleResId)) },
//                        selected = currentRoute == item.screen.route,
//                        onClick = {
//                            navigationState.navigateTo(item.screen.route)
//                        }
//                    )
//                }
//            }
//        },
//    ) {
//
//        AppNavGraph(
//            navController = navigationState.navHostController,
//            homeScreenContent = { HomeScreen(paddingValues = it, onCommentClickListener = {}) },
//            favoriteScreenContent = { TextCounter(name = "Favorite Screen") },
//            profileScreenContent = { TextCounter(name = "Profile Screen") })
//    }
}