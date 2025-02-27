package com.educational.jetpackbasic.component.bottomView

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Samset on 2/27/25.
Copyright (c) 2025  All rights reserved.
 */
sealed class BottomNavigationItem(val route:String, val resource: ImageVector, val title:String){
    object Home : BottomNavigationItem("Home",Icons.Filled.Home,"Home")
    object Profile : BottomNavigationItem("Profile",Icons.Filled.AccountCircle,"Profile")
    object Settings : BottomNavigationItem("Settings",Icons.Filled.Settings,"Settings")
    object More : BottomNavigationItem("More",Icons.Filled.MoreVert,"More")
}