package com.fabianospdev.getcallrec.ui.pages.home.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class HomeItem(val title: String)

@Composable
fun HomeItem(home: HomeItem) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(text = home.title, modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeItem(home = HomeItem("Item1"))
}
