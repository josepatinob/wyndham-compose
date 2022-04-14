package com.example.wyndhamcompose.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wyndhamcompose.ui.theme.RatingGreen

@Composable
fun Rating(rating: Int, modifier: Modifier = Modifier) {
    val maxRating = 5
    Row {
        for (i in 1..maxRating) {
            Icon(
                imageVector = if (i <= rating) Icons.Filled.Circle else Icons.Default.RadioButtonUnchecked,
                contentDescription = "Rating Circle",
                tint = RatingGreen,
                modifier = modifier
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewRating() {
    Rating(3)
}