package com.fabianospdev.getcallrec.ui.pages.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fabianospdev.getcallrec.ui.pages.home.widgets.HomeItem
import com.fabianospdev.getcallrec.ui.theme.GradientUtils


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
    val listState = rememberLazyListState()

    Box(
        modifier = Modifier.fillMaxSize().background(Color.Transparent),
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(brush = GradientUtils.viscousGradient)
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "Home") },
                        )
                    },
                    modifier = Modifier.fillMaxSize().background(Color.Transparent),
                    content = {
                        Box(
                            modifier = Modifier.padding(it.calculateTopPadding())
                                .fillMaxSize()
                                .background(Color.Transparent)
                        ) {
                            Card(
                                modifier = Modifier.fillMaxSize()
                                    .background(Color.Transparent).padding(0.dp),
                                elevation = 4.dp,
                                content = {
                                    Column(modifier = Modifier.padding(8.dp)
                                    ) {
                                        viewModel.itemsList.forEach { item ->
                                            HomeItem(item)
                                        }
                                    }
                                },
                                backgroundColor = Color.Transparent,
                            )
                        }
                    },
                    backgroundColor = Color.Transparent, // Define a cor de fundo do Scaffold como transparente
                    contentColor = Color.Transparent // Define a cor do conteúdo do Scaffold
                )
            }
        }
    )
}
