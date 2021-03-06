package com.example.wyndhamcompose.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wyndhamcompose.R
import com.example.wyndhamcompose.ui.components.*
import com.example.wyndhamcompose.ui.model.RatingSummary
import com.example.wyndhamcompose.ui.model.Review
import com.example.wyndhamcompose.ui.theme.OffWhite

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ReviewDetails() {
    LazyColumn {
        item {
            RatingOverview()
        }
        items(Review.recentReviewsList) {
            RecentReviews(it)
        }
        item {
            LegalDisclosure()
        }
    }
}

@Composable
fun LegalDisclosure() {
    Text(
        text = "These reviews are the subjective opinions of individual travelers and not of TripAdvisor LLC nor of its partners. 2022 TripAdvisor LLC",
        fontSize = 10.sp,
        color = Color.Gray,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )
}

@Composable
fun RatingOverview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite)
    ) {
        // travelers choice
        TravelersChoice()
        // review summary
        ReviewSummary()
        // Rating summary
        RatingSummary()
        Spacer(modifier = Modifier.size(20.dp))
        RecentReviewsTitle()
    }
}

@Composable
fun RecentReviewsTitle() {
    Row(
        modifier = Modifier
            .height(65.dp)
            .fillMaxWidth()
            .background(color = Color.White),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RatingTitle("Recent Reviews")
    }
}

@Composable
fun TravelersChoice() {
    val travelersChoice = false
    if (travelersChoice) {
        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Travelers Choice 2021")
        }
    }
}

@Composable
fun ReviewSummary() {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.tripadvisor_logo),
                contentDescription = "trip advisor logo",
                modifier = Modifier.size(30.dp)
            )
            Spacer(Modifier.size(10.dp))
            Rating(3)
            Spacer(Modifier.size(10.dp))
            Text(
                text = "3",
                fontSize = 18.sp,
                color = Color.DarkGray
            )
            Spacer(Modifier.size(10.dp))
            Text(
                text = "1278 reviews",
                fontSize = 14.sp,
                color = Color.DarkGray
            )
        }
    }
}

@Composable
fun RatingSummary() {
    Row(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .background(color = Color.White)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 60.dp, vertical = 15.dp)
                .height(200.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RatingTitle("Rating Summary")
            Spacer(modifier = Modifier.size(15.dp))
            CategoryRating(RatingSummary.ratingSummaryList)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun ReviewDetailsPreview() {
    ReviewDetails()
}