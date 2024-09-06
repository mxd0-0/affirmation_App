package com.example.affirmationapp.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
  @StringRes  val text: Int,
  @DrawableRes  val photo : Int
)
