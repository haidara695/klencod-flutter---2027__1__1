package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val RoyalNavyDark = Color(0xFF0A1628)
val RoyalBluePrimary = Color(0xFF2563EB)
val RoyalGoldAccent = Color(0xFFD97706)
val RoyalGoldLight = Color(0xFFF59E0B)
val EmeraldSuccess = Color(0xFF10B981)
val SurfaceLight = Color(0xFFF0F4FA)
val CardSurfaceLight = Color(0xFFFFFFFF)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF3B82F6),
    onPrimary = Color.White,
    secondary = RoyalGoldLight,
    onSecondary = Color(0xFF0A1628),
    tertiary = EmeraldSuccess,
    background = Color(0xFF090E1A),
    surface = Color(0xFF11192C),
    onBackground = Color(0xFFF8FAFC),
    onSurface = Color(0xFFF8FAFC)
)

private val LightColorScheme = lightColorScheme(
    primary = RoyalBluePrimary,
    onPrimary = Color.White,
    secondary = RoyalGoldAccent,
    onSecondary = Color.White,
    tertiary = EmeraldSuccess,
    background = SurfaceLight,
    surface = CardSurfaceLight,
    onBackground = RoyalNavyDark,
    onSurface = RoyalNavyDark
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
