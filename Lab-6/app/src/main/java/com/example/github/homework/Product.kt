package com.example.github.homework

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Product(var name :String , var url : Int): Parcelable{}