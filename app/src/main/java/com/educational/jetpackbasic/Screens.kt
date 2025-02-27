package com.educational.jetpackbasic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

/**
 * Created by Samset on 2/27/25.
Copyright (c) 2025  All rights reserved.
 */

@Composable
fun HomeScreen(padding: PaddingValues) {
  Column(modifier = Modifier.fillMaxSize().padding(bottom = padding.calculateBottomPadding(), top = padding.calculateTopPadding())){
    Text(
      text = "Home Screen",
      fontWeight = FontWeight.Bold,
      color = Color.Black,
      modifier = Modifier.align(Alignment.CenterHorizontally),
      textAlign = TextAlign.Center,
      fontSize = 25.sp
    )

  }

}

@Composable
fun ProfileScreen(padding: PaddingValues){
  Column(modifier = Modifier.fillMaxSize().padding(bottom = padding.calculateBottomPadding(), top = padding.calculateTopPadding())){
    Text(
      text = "Profile Screen",
      fontWeight = FontWeight.Bold,
      color = Color.Black,
      modifier = Modifier.align(Alignment.CenterHorizontally),
      textAlign = TextAlign.Center,
      fontSize = 25.sp
    )
  }
}


@Composable
fun SettingsScreen(padding: PaddingValues) {
  Column(modifier = Modifier.fillMaxSize().background(color = Color.Cyan).padding(bottom = padding.calculateBottomPadding(), top = padding.calculateTopPadding())){
    Text(
      text = "Settings Screen",
      fontWeight = FontWeight.Bold,
      color = Color.Black,
      modifier = Modifier.align(Alignment.CenterHorizontally),
      textAlign = TextAlign.Center,
      fontSize = 25.sp
    )
  }
}

@Composable
fun MoreScreen(padding: PaddingValues) {
  Column(modifier = Modifier.fillMaxSize().padding(bottom = padding.calculateBottomPadding(), top = padding.calculateTopPadding())){
    Text(
      text = "More Screen",
      fontWeight = FontWeight.Bold,
      color = Color.Black,
      modifier = Modifier.align(Alignment.CenterHorizontally),
      textAlign = TextAlign.Center,
      fontSize = 25.sp
    )
  }
}