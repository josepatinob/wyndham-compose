package com.example.wyndhamcompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wyndhamcompose.ui.model.RatingSummary

@Composable
fun CategoryRating(ratingList: List<RatingSummary>) {
    Column {
        ratingList.forEach {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(it.category)
                Rating(it.rating)
            }
            Spacer(modifier = Modifier.size(5.dp))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CategoryRatingPreview() {
    CategoryRating(RatingSummary.ratingSummaryList)
}