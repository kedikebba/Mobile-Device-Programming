package com.example.github.homework

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 *   Created by zhangziyi on 9/3/20 19:25
 */
@Parcelize
data class Product(var name :String , var url : Int): Parcelable{}