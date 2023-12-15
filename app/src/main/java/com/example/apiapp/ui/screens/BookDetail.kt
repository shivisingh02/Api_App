package com.example.apiapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apiapp.R

@Composable
fun BookDetail(navigateBack:() -> Unit){
    Column(modifier = Modifier.background(Color.White)) {
        Box(modifier = Modifier.background(Color.White)) {
            AppBar(navigateBack)
            BookImg()
        }
        Row {
            Text(text = "The River We Remember",
                color = Color.Black,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 10.dp,top = 10.dp),
                fontWeight = FontWeight.W800)
            Text(text = "450 INR",
                color = Color.DarkGray,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 60.dp, top = 10.dp),
                fontWeight = FontWeight.W800)
        }
        Genres()
        Text(text = "Book Summary",
            fontSize = 30.sp,
            color = Color.Black,
            modifier  = Modifier.padding(start = 20.dp),
            fontWeight = FontWeight.W500,
            fontFamily = FontFamily.Serif)

    }
}

@Composable
fun AppBar(navigateBack: () -> Unit){
    Card(
        modifier = Modifier.size(width = 500.dp , height = 300.dp),
        colors =  CardDefaults.
        elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Row {
            FloatingActionButton(onClick = navigateBack,
                containerColor = Color.White,
                contentColor = Color.DarkGray,
                shape = CircleShape,
                modifier = Modifier.padding(10.dp)) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back Screen"
                )

            }
            FloatingActionButton(onClick = { /*TODO*/ },
                containerColor = Color.White,
                contentColor = Color.DarkGray,
                shape = CircleShape,
                modifier = Modifier.padding(start = 270.dp, top = 10.dp)
                ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Back Screen"
                )
            }
        }

    }
}
@Composable
fun BookImg(){
    Card(modifier = Modifier
        .padding(start = 110.dp, top = 100.dp)
        .size(width = 200.dp, height = 300.dp)) {
        Image(painter = painterResource(id = R.drawable.book3), contentDescription ="Book",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(width = 200.dp , height = 300.dp))

    }
}

@Composable
fun Genres(){
    Row {
        Card(
            modifier = Modifier
                .size(width = 150.dp, height = 70.dp)
                .padding(20.dp),
            colors = CardDefaults
                .cardColors(Color.hsl(238f, 0.4f, 0.9f)),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(
                text = "Mystery",
                color = Color.hsl(253f, 0.7f, 0.5f),
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 20.dp, top = 3.dp)
            )
        }
        Card(
            modifier = Modifier
                .size(width = 150.dp, height = 50.dp)
                .padding(top = 20.dp)
                ,
            colors = CardDefaults
                .cardColors(Color.hsl(238f, 0.4f, 0.9f)),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(
                text = "Historical Fiction",
                color = Color.hsl(253f, 0.7f, 0.5f),
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 10.dp, top = 3.dp)
            )
        }
    }
}