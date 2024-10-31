package com.assignment.walkingapp.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CircularProgressBar(
    progress: Float, // Progress from 0.0f to 1.0f
    totalSteps: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.size(150.dp) // Adjust size as needed
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Background Arc
            drawArc(
                color = Color(0xFF898CF3), // Light purple color
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = 45.dp.toPx(), cap = StrokeCap.Round)
            )

            // Foreground Arc (Progress)
            drawArc(
                color = Color(0xFF6467DC), // Darker purple color
                startAngle = -90f,
                sweepAngle = 360 * progress,
                useCenter = false,
                style = Stroke(width = 45.dp.toPx(), cap = StrokeCap.Round)
            )
        }

        // Center Text
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = totalSteps.toString(),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Steps",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun showProgress(){
    CircularProgressBar(
        progress = 0.7f, // 70% progress
        totalSteps = 4275,
        modifier = Modifier.padding(16.dp)
    )
}
