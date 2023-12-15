package com.example.apiapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apiapp.R
@Composable
fun BookSearch(navigateUp: () -> Unit){
    Column(modifier = Modifier.background(Color.White)) {
        UpperBox(navigateUp)
    }
}

@Composable
fun UpperBox(navigateUp: () -> Unit) {
    Card(
        modifier = Modifier.size(width = 500.dp, height = 300.dp),
        colors = CardDefaults.
        elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
        elevation = CardDefaults.cardElevation(10.dp)
        )
    {
        Column {
            SearchBox( )
            Slider1()
        }
    }
    Text(
        text = "Trending Books",
        fontSize = 30.sp,
        color = Color.Black,
        fontWeight = FontWeight.W500,
        modifier = Modifier.padding(start = 20.dp , top = 5.dp)
    )
    Slider2(navigateUp)
    Text(text = "Genres",
        color = Color.Black,
        fontSize = 30.sp,
        modifier = Modifier.padding(start = 20.dp , top= 5.dp))
    Slider3()
}

@Composable
fun SearchBox() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .size(width = 410.dp, height = 100.dp)
            .padding(20.dp),
        colors = CardDefaults.cardColors(Color.hsl(243f,0.7f,0.84f ))

    ) {
        Row {
            Text(
                text = "Enter Book Name or Author",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 10.dp, top = 15.dp),
                color = Color.Black
            )
            IconButton(
                onClick =  {},
                modifier = Modifier
                    .padding(start = 10.dp, top = 5.dp)
                    .size(80.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.Black
                )
            }
        }
    }
}

@Composable
fun Slider1() {
    LazyRow() {
        item {
            Card(
                colors = CardDefaults.cardColors(Color.White),
                modifier = Modifier
                    .size(width = 270.dp, height = 200.dp)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Best Books of 2023",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 15.dp, top = 5.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black
                )
                Image(
                    painter = painterResource(id = R.drawable.book1),
                    contentDescription = "purchase books",
                    modifier = Modifier
                        .size(300.dp)
                        .padding(top = 5.dp)
                )
            }
            Card(
                colors = CardDefaults.cardColors(Color.White),
                modifier = Modifier
                    .size(width = 270.dp, height = 200.dp)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Best Books of 2022",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 15.dp, top = 5.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black
                )
                Image(
                    painter = painterResource(id = R.drawable.book1),
                    contentDescription = "purchase books",
                    modifier = Modifier
                        .size(300.dp)
                        .padding(top = 5.dp)
                )
            }
            Card(
                colors = CardDefaults.cardColors(Color.White),
                modifier = Modifier
                    .size(width = 270.dp, height = 200.dp)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Best Books of 2021",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 15.dp, top = 5.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black
                )
                Image(
                    painter = painterResource(id = R.drawable.book1),
                    contentDescription = "purchase books",
                    modifier = Modifier
                        .size(300.dp)
                        .padding(top = 5.dp)
                )
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Slider2(navigateUp: () -> Unit) {
    LazyRow(modifier = Modifier.padding(top = 10.dp)) {
        item {
            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 300.dp)
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.book2),
                    contentDescription = "Book",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .size(500.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
            Card(
                onClick = navigateUp,
                modifier = Modifier
                    .size(width = 200.dp, height = 300.dp)
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.book3),
                    contentDescription = "Book",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .size(500.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 300.dp)
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.book4),
                    contentDescription = "Book",
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .size(500.dp),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Slider3(){
    LazyRow(modifier = Modifier.padding(10.dp)){
        item() {
            Card(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.
                elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Text(text = "Romance",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 25.dp , top = 10.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black)
            }
            Card(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.
                elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Text(text = "Fantasy",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 25.dp , top = 10.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black)
            }
            Card(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.
                elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Text(text = "Thriller",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 25.dp , top = 10.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black)
            }
            Card(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.
                elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Text(text = "Action",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 25.dp , top = 10.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black)
            }
            Card(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(width = 150.dp, height = 50.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.
                elevatedCardColors(Color.hsl(253f, 0.7f, 0.78f)),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Text(text = "Comedy",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 25.dp , top = 10.dp),
                    fontWeight = FontWeight.W700,
                    color = Color.Black)
            }
        }
    }

}