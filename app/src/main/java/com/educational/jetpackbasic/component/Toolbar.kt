package com.educational.jetpackbasic.component

import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.educational.jetpackbasic.R

/**
 * Created by Samset on 2/27/25.
Copyright (c) 2025  All rights reserved.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(){
    TopAppBar(
        modifier = Modifier.height(60.dp),
        title = { Text(text = "MyApp", color = colorResource(R.color.white), fontSize = 20.sp) },
        navigationIcon = {
            /*IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Home,
                    contentDescription = "Description")
            }*/
        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.primary),
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.AccountCircle, tint = androidx.compose.ui.graphics.Color.Black, contentDescription = "Profile")
            }
            IconButton({}) {
                Icon(imageVector = Icons.Filled.Settings, tint = androidx.compose.ui.graphics.Color.Black, contentDescription = "Settings")
            }
        }
    )

}