package com.educational.jetpackbasic.navigation


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.educational.jetpackbasic.HomeScreen
import com.educational.jetpackbasic.MoreScreen
import com.educational.jetpackbasic.ProfileScreen
import com.educational.jetpackbasic.SettingsScreen
import com.educational.jetpackbasic.component.bottomView.BottomNavigationItem

/**
 * Created by Samset on 2/27/25.
Copyright (c) 2025  All rights reserved.
 */

@Composable
fun SamNavigation(navController: NavHostController, route: String, padding: PaddingValues) {
    NavHost(navController = navController, startDestination = route) {
        composable(BottomNavigationItem.Home.route) {
            HomeScreen(padding)
        }
        composable(BottomNavigationItem.Profile.route) {
            ProfileScreen(padding)
        }
        composable(BottomNavigationItem.Settings.route) {
            SettingsScreen(padding)
        }
        composable(BottomNavigationItem.More.route) {
            MoreScreen(padding)
        }

    }
}