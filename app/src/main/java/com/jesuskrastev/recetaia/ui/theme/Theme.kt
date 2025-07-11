package com.example.compose
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.jesuskrastev.recetaia.ui.theme.PoppinsTypography
import com.jesuskrastev.recetaia.ui.theme.backgroundDark
import com.jesuskrastev.recetaia.ui.theme.backgroundDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.backgroundDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.backgroundLight
import com.jesuskrastev.recetaia.ui.theme.backgroundLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.backgroundLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.errorContainerDark
import com.jesuskrastev.recetaia.ui.theme.errorContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.errorContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.errorContainerLight
import com.jesuskrastev.recetaia.ui.theme.errorContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.errorContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.errorDark
import com.jesuskrastev.recetaia.ui.theme.errorDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.errorDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.errorLight
import com.jesuskrastev.recetaia.ui.theme.errorLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.errorLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceDark
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceLight
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.inverseOnSurfaceLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryDark
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryLight
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.inversePrimaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceDark
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceLight
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.inverseSurfaceLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onBackgroundDark
import com.jesuskrastev.recetaia.ui.theme.onBackgroundDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onBackgroundDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onBackgroundLight
import com.jesuskrastev.recetaia.ui.theme.onBackgroundLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onBackgroundLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerDark
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerLight
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorDark
import com.jesuskrastev.recetaia.ui.theme.onErrorDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorLight
import com.jesuskrastev.recetaia.ui.theme.onErrorLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onErrorLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryDark
import com.jesuskrastev.recetaia.ui.theme.onPrimaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryLight
import com.jesuskrastev.recetaia.ui.theme.onPrimaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onPrimaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryDark
import com.jesuskrastev.recetaia.ui.theme.onSecondaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryLight
import com.jesuskrastev.recetaia.ui.theme.onSecondaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSecondaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceDark
import com.jesuskrastev.recetaia.ui.theme.onSurfaceDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceLight
import com.jesuskrastev.recetaia.ui.theme.onSurfaceLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantDark
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantLight
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onSurfaceVariantLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryDark
import com.jesuskrastev.recetaia.ui.theme.onTertiaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryLight
import com.jesuskrastev.recetaia.ui.theme.onTertiaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.onTertiaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.outlineDark
import com.jesuskrastev.recetaia.ui.theme.outlineDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.outlineDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.outlineLight
import com.jesuskrastev.recetaia.ui.theme.outlineLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.outlineLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.outlineVariantDark
import com.jesuskrastev.recetaia.ui.theme.outlineVariantDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.outlineVariantDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.outlineVariantLight
import com.jesuskrastev.recetaia.ui.theme.outlineVariantLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.outlineVariantLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.primaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.primaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.primaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.primaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.primaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.primaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.primaryDark
import com.jesuskrastev.recetaia.ui.theme.primaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.primaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.primaryLight
import com.jesuskrastev.recetaia.ui.theme.primaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.primaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.scrimDark
import com.jesuskrastev.recetaia.ui.theme.scrimDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.scrimDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.scrimLight
import com.jesuskrastev.recetaia.ui.theme.scrimLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.scrimLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryDark
import com.jesuskrastev.recetaia.ui.theme.secondaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryLight
import com.jesuskrastev.recetaia.ui.theme.secondaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.secondaryLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightDark
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightLight
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceBrightLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerDark
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighDark
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighLight
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestDark
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestLight
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerHighestLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLight
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowDark
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowLight
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestDark
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestLight
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceContainerLowestLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDark
import com.jesuskrastev.recetaia.ui.theme.surfaceDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDimDark
import com.jesuskrastev.recetaia.ui.theme.surfaceDimDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDimDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDimLight
import com.jesuskrastev.recetaia.ui.theme.surfaceDimLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceDimLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceLight
import com.jesuskrastev.recetaia.ui.theme.surfaceLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantDark
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantLight
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.surfaceVariantLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerDark
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerLight
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryContainerLightMediumContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryDark
import com.jesuskrastev.recetaia.ui.theme.tertiaryDarkHighContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryDarkMediumContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryLight
import com.jesuskrastev.recetaia.ui.theme.tertiaryLightHighContrast
import com.jesuskrastev.recetaia.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

@Composable
fun RecetaIATheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          if (darkTheme) darkScheme else lightScheme
      }
      
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = PoppinsTypography(),
    content = content
  )
}