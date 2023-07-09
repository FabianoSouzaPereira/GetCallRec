package com.fabianospdev.getcallrec

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fabianospdev.getcallrec.ui.pages.home.HomeScreen
import com.fabianospdev.getcallrec.ui.pages.settings.SettingsScreen
import com.fabianospdev.getcallrec.ui.theme.GetCallRecTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetCallRecTheme {
                MainAppContent()
            }
        }
    }
}

@Preview
@Composable
fun MainAppContent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen0") {
        composable("screen0") { HomeScreen(navController) }
        composable("screen1") { SettingsScreen(navController) }
    }
}

/** Extension to avoid call unknown route index */
fun NavController.navigateSafe(route: String) {
    if (graph.findStartDestination().route != route) {
        navigate(route)
    }
}