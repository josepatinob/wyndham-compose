package com.example.wyndhamcompose.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wyndhamcompose.ui.model.Review

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun RecentReviews(reviews: List<Review>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(horizontal = 15.dp, vertical = 20.dp)
    ) {
        RatingTitle("Recent Reviews", Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.size(20.dp))
        reviews.forEach {
            Review(it)
        }
        Spacer(modifier = Modifier.size(30.dp))
        Text(
            text = "These reviews are the subjective opinions of individual travelers and not of TripAdvisor LLC nor of its partners. 2022 TripAdvisor LLC",
            fontSize = 10.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun RecentReviewsPreview() {
    RecentReviews(reviews = Review.recentReviewsList)
}