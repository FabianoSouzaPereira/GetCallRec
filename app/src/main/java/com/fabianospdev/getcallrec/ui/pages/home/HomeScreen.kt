package com.fabianospdev.getcallrec.ui.pages.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    CompositionLocalProvider(LocalNavHostController provides navController) {
        HomeScreen(navController =  navController)
    }
}
private val LocalNavHostController = compositionLocalOf<NavHostController> { error("No NavHostController found") }

@Composable
fun HomeScreen(navController: NavHostController) {
    val viewModel: HomeViewModel = viewModel()
}
