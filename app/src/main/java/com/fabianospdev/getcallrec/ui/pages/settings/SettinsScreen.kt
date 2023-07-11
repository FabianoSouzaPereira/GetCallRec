package com.fabianospdev.getcallrec.ui.pages.settings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fabianospdev.getcallrec.ui.pages.home.HomeScreen

@Preview
@Composable
fun SettingsScreenPreview() {
    val navController = rememberNavController()
    CompositionLocalProvider(LocalNavHostController provides navController) {
        SettingsScreen(navController =  navController)
    }
}
private val LocalNavHostController = compositionLocalOf<NavHostController> { error("No NavHostController found") }

@Composable
fun SettingsScreen(navController: NavHostController) {
    val viewModel: SettingsViewModel = viewModel()
}
