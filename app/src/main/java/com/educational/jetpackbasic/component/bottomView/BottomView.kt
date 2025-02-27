package com.educational.jetpackbasic.component.bottomView

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

/**
 * Created by Samset on 2/27/25.
Copyright (c) 2025  All rights reserved.
 */


@Composable
fun BottomView( navController:NavController) {

    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Profile,
        BottomNavigationItem.Settings,
        BottomNavigationItem.More
    )
    NavigationBar(containerColor = Color.Green, contentColor = Color.White, modifier = Modifier.height(120.dp)) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach{ item ->
            NavigationBarItem(
                onClick = { navController.navigate(item.route){
                    restoreState=true // restore previous state
                } },
                icon = { Icon(imageVector =  item.resource, contentDescription = "None") },
                selected = currentRoute==item.route,
                label = { Text(text = item.title) },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = Color.Black,
                    indicatorColor = Color.Black
                )
            )
        }



    }
}