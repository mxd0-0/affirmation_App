package com.example.affirmationapp.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data class representing an affirmation
data class Affirmation(
    @StringRes val text: Int, // Resource ID for the affirmation text
    @DrawableRes val photo: Int // Resource ID for the affirmation image
)