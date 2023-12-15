package com.example.apiapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apiapp.ui.screens.BookDetail
import com.example.apiapp.ui.screens.BookSearch

enum class BookNavigation{
First ,
Second
}

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = BookNavigation.First.name ) {
        composable(BookNavigation.First.name) {
           BookSearch(navigateUp = {navController.navigate(BookNavigation.Second.name)})
        }
        composable(BookNavigation.Second.name){
            BookDetail(navigateBack = {navController.navigate(BookNavigation.First.name)})
        }
    }
}


