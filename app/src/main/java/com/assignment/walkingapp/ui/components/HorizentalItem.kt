package com.assignment.walkingapp.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assignment.walkingapp.R
import com.assignment.walkingapp.ui.theme.appFontFamily

@Composable
fun HorizontalItem(modifier: Modifier = Modifier,
                   @DrawableRes image : Int,
                   title : String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            modifier = Modifier.size(80.dp),
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 5.dp
            )
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(painter = painterResource(image), "null",modifier =
                Modifier.align(Alignment.Center)
                    .size(45.dp))
            }

        }
        Text(title,
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = appFontFamily,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier.padding(top = 6.dp)
        )
    }
}