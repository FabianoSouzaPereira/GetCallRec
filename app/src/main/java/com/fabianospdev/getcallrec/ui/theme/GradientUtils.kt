package com.fabianospdev.getcallrec.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode

object GradientUtils {

    val viscousGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(
                Color(0xFF202020), // Cinza ainda mais escuro
                Color(0xFF101010), // Preto
                Color(0xFF202020), // Cinza ainda mais escuro
            ),
            start = Offset.Zero,
            end = Offset.Infinite
        )

    val viscousGradientStartColor: Color
        get() = Color(0xFF202020)

    val viscousGradientEndColor: Color
        get() = Color(0xFF101010)

    val blackPearlGradientWithoutVolume: Brush
        get() = Brush.linearGradient(
            colors = listOf(
                Color(0xFF303030), // Cinza escuro
                Color(0xFF404040), // Cinza médio
                Color(0xFF202020), // Cinza ainda mais escuro
                Color(0xFF101010), // Preto
                Color(0xFF202020), // Cinza ainda mais escuro
                Color(0xFF404040), // Cinza médio
                Color(0xFF303030) // Cinza escuro
            ),
            start = Offset.Zero,
            end = Offset.Infinite
        )

    val redToBlueGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(Color.Red, Color.Blue)
        )

    val greenToYellowGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(Color.Green, Color.Yellow)
        )

    val rainbowGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(
                Color.Red,
                Color.Cyan,
                Color.Yellow,
                Color.Green,
                Color.Blue,
                Color.Magenta,
                Color.LightGray
            )
        )

    val transparentGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(
                Color.Red.copy(alpha = 0.5f),
                Color.Blue.copy(alpha = 0.5f)
            )
        )

    val radialGradient: Brush
        get() = Brush.radialGradient(
            colors = listOf(Color.Red, Color.Blue),
            center = Offset(0.5f, 0.5f),
            radius = 0.5f
        )

    val customGradient: Brush
        get() = Brush.linearGradient(
            colors = listOf(Color.Red, Color.Blue),
            start = Offset(0.2f, 0.2f),
            end = Offset(0.8f, 0.8f),
            tileMode = TileMode.Repeated
        )

}
