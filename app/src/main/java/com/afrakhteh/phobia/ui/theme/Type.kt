package com.afrakhteh.phobia.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.afrakhteh.phobia.R


val mainFontFamily = FontFamily(
    Font(R.font.robotoregular,FontWeight.Normal),
    Font(R.font.robotobold, FontWeight.Bold)
)

val fontFamily = FontFamily(
    Font(R.font.horroroid, FontWeight.Normal),
    Font(R.font.horroroidbold, FontWeight.Bold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = fontFamily,
        fontSize = 30.sp,
    ),
    h2 = TextStyle(
        fontFamily = mainFontFamily,
        fontSize = 24.sp,
    ),
    h3 = TextStyle(
        fontFamily = fontFamily,
        fontSize = 18.sp,
    ),
    button = TextStyle(
        fontFamily = mainFontFamily,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = mainFontFamily,
        fontSize = 16.sp
    )
)