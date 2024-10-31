package com.assignment.walkingapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
@Preview
fun VerticalItem() {
    Card(
        shape = RoundedCornerShape(15),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp, vertical = 17.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.ic_man_walking), "null",
                modifier = Modifier.size(30.dp)
            )

            Column(
                modifier = Modifier.padding(
                    horizontal = 20.dp
                ).weight(1f)
            ) {
                Text(
                    "2,542 Steps",
                    style = TextStyle(
                        fontWeight = FontWeight.Medium,
                        fontFamily = appFontFamily,
                        color = Color.Black,
                        fontSize = 16.sp
                    )
                )
                Text(
                    "2024-07-16 23:05:27",
                    style = TextStyle(
                        fontWeight = FontWeight.Medium,
                        fontFamily = appFontFamily,
                        color = Color(0xFF737373),
                        fontSize = 8.sp
                    )
                )

            }
            Image(painter = painterResource(R.drawable.ic_dots_shape),"null",
               modifier = Modifier.size(31.dp))


        }

    }
}