package com.redbird.ft.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Login.path
    ) {
        addLoginView(navController, this)
        addHomeView(navController, this)
    }
}

private fun addLoginView(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Login.path) {
        LoginView(
            navigateToHome = {
                navController.navigate(NavRoute.Home.path)
            }
        )
    }
}

private fun addHomeView(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {
        HomeView(
            popBackStack = { navController.popBackStack() },
            popUpToLogin= { popUpToLogin(navController) },
        )
    }
}

private fun popUpToLogin(navController: NavHostController) {
    navController.popBackStack(NavRoute.Login.path, inclusive = false)
}