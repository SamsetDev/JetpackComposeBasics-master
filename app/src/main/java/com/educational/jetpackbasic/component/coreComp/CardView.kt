package com.educational.jetpackbasic.component.coreComp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Samset on 2/28/25.
Copyright (c) 2025  All rights reserved.
 */

@Composable
fun CardView( icon:Int, details:String,onItemClick:(String) -> Unit) {
  Card(modifier = Modifier.fillMaxSize(), shape = RoundedCornerShape(8.dp), elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {
    Row(modifier = Modifier.fillMaxWidth().clickable { onItemClick(details) }) {
      Image(
        painter = painterResource(id = icon),
        contentDescription = "image",
        modifier = Modifier
          .padding(8.dp)
          .size(60.dp)
          .clip(RoundedCornerShape(CornerSize(6.dp)))
          .align(alignment = Alignment.CenterVertically)
      )
      Text(text = details, fontSize = 18.sp, fontWeight = FontWeight.Normal)
    }
  }
}