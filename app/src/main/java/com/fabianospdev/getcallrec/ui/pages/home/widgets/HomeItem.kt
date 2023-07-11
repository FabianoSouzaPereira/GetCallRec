package com.fabianospdev.getcallrec.ui.pages.home.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fabianospdev.getcallrec.ui.theme.Typography

data class Item(val title: String)

@Composable
fun HomeItem(item: Item) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 8.dp,vertical = 8.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(16.dp,0.dp,16.dp,0.dp),
            elevation = 4.dp,
            content = {
                Column(
                    Modifier.height(60.dp).fillMaxWidth()
                ) {
                    Text(
                        text = item.title,
                        modifier = Modifier.weight(1f)
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(16.dp,0.dp,16.dp,0.dp),
                        softWrap = true,
                        onTextLayout = {},
                        style = customTextStyle
                    )
                }
            },
            backgroundColor = Color.DarkGray,
            border = BorderStroke(2.dp, Color.Blue)
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeItem(Item("Item 1"))
}
