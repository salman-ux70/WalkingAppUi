package com.assignment.walkingapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.assignment.walkingapp.R

 val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.poppins_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.poppins_medium,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.poppins_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),

        )
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = appFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.5.sp,

    )

)