package com.educational.jetpackbasic.utils

import com.educational.jetpackbasic.R
import com.educational.jetpackbasic.model.UserData
import java.util.ArrayList

/**
 * Created by Samset on 2/28/25.
Copyright (c) 2025  All rights reserved.
 */
object DataSource {
  val dataList: ArrayList<UserData> = ArrayList()
  fun getListData() : ArrayList<UserData>{
    dataList.clear()
    for (i in 1..50){
      val data= UserData(R.drawable.ic_launcher_background,"Item "+i)
      dataList.add(data)
    }
    return dataList
  }

}