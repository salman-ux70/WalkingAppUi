package com.assignment.walkingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assignment.walkingapp.data.Collection
import com.assignment.walkingapp.ui.components.CircularProgressBar
import com.assignment.walkingapp.ui.components.CustomTabRow
import com.assignment.walkingapp.ui.components.DrawableStartWrapper
import com.assignment.walkingapp.ui.components.HorizontalItem
import com.assignment.walkingapp.ui.components.VerticalItem
import com.assignment.walkingapp.ui.theme.appFontFamily

@Composable
@Preview
fun WalkApp(modifier: Modifier = Modifier) {

    Surface(modifier.background(color = Color(0xFFEAEAEA))
        .verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(
                        start = 27.dp,
                        end = 25.dp, top = 26.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 8.sp,
                            fontFamily = appFontFamily
                        )
                    ) {
                        append("Have a nice walk\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 16.sp,
                            fontFamily = appFontFamily
                        )
                    ) {
                        append("Salman")
                    }
                }, modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(R.drawable.ic_user), "null",
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.width(26.dp))
                Image(
                    painter = painterResource(R.drawable.ic_bell), "null",
                    modifier = Modifier.size(25.dp)
                )
            }

            CustomTabRow(
                modifier = Modifier
                    .padding(top = 17.dp, start = 25.dp, end = 25.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(color = Color(0xFFD9D9D9))
                    .fillMaxWidth()
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(26.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(modifier = modifier.fillMaxWidth()) {
                        DrawableStartWrapper(
                            modifier = Modifier
                                .padding(
                                    start = 19.dp,
                                    top = 18.dp
                                )
                                .weight(1f), drawableStart = R.drawable.image_33
                        ) {
                            Text(
                                text = "Daily Steps", style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 14.sp,
                                    lineHeight = 21.sp
                                )
                            )

                        }


                        Row(
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier

                                .padding(top = 18.dp, end = 18.dp)
                        ) {
                            Text(
                                text = "Today",
                                style = MaterialTheme.typography.labelSmall
                            )

                            Spacer(modifier = Modifier.width(8.dp))

                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Dropdown arrow"
                            )
                        }
                    }

                    CircularProgressBar(
                        progress = 0.75f,
                        4275,
                        modifier = Modifier.padding(top = 16.dp)
                    )


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 19.dp, end = 20.dp, top = 44.dp, bottom = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Last week avg: 7,245 Steps",
                            style = TextStyle(
                                color = Color(0xFF5F5F5F), fontSize = 11.sp,
                                lineHeight = 16.5.sp,
                            ),
                            modifier = Modifier.weight(1f)
                        )

                        Icon(
                            imageVector = Icons.Filled.Create,
                            contentDescription = "Dropdown arrow",
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFEAEAEA),
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .size(24.dp)
                        )

                    }


                }
            }

            LazyRow(modifier = Modifier.fillMaxWidth().padding(horizontal = 26.dp),
                horizontalArrangement = Arrangement.SpaceBetween ) {
                items(Collection.HorizontalItemList()) { item ->
                    HorizontalItem(image = item.image, title = item.title)

                }
            }
            Text(text = "Recent Activities",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = appFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    lineHeight = 22.5.sp
                ),
                modifier = Modifier.padding(
                    start = 26.dp,
                    top = 24.dp
                )
            )
            LazyColumn(modifier = Modifier.height(220.dp).fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
               items(2){
                   VerticalItem()
               }
            }
        }
    }
}