package com.assignment.walkingapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview(showBackground = true)
fun CustomTabRow(modifier: Modifier = Modifier) {
    var selectedIndex by remember { mutableStateOf(0) }
    val list = listOf("Logging", "Progress", "Challange")


    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = modifier,
        indicator = { tabPositions: List<TabPosition> ->
            Box { }

        },
        divider = {}
    ) {
        list.forEachIndexed { index, text ->
            val selected = selectedIndex == index
            Row(modifier = Modifier.background(Color(0xFFD9D9D9))) {
                Tab(
                    modifier =  Modifier
                        .padding(
                            start = if (index == 0) 3.dp else 0.dp,
                            top = 3.dp,
                            bottom = 3.dp,
                            end = if (index == list.lastIndex) 3.dp else 0.dp
                        )
                        .clip(RoundedCornerShape(50.dp))
                        .background(
                            if (selected) Color.White else Color(0xffD9D9D9)
                        ),
                    selected = selected,
                    onClick = { selectedIndex = index },
                    text = { Text(text = text, color = Color.Black) }
                )
            }


        }

    }


}