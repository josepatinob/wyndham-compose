package com.example.wyndhamcompose.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wyndhamcompose.ui.model.Review
import com.example.wyndhamcompose.ui.theme.WyndhamLightBlue
import com.example.wyndhamcompose.utils.formatDate
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Review(review: Review) {
    var showMore by remember { mutableStateOf(false) }
    val formattedDate = formatDate(review.reviewDate)

    Column {
        Divider(thickness = 1.dp)
        Spacer(modifier = Modifier.size(25.dp))
        Row(modifier = Modifier.padding(vertical = 2.dp)) {
            Text(
                text = "${review.name}: ",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Text(
                text = review.location, color = Color.DarkGray
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(5.dp)
        ) {
            Rating(rating = review.rating, Modifier.size(12.dp))
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Reviewed: $formattedDate",
                color = Color.DarkGray,
                fontSize = 12.sp
            )
        }
        Text(
            text = review.title,
            modifier = Modifier.padding(vertical = 2.dp),
            color = Color.DarkGray
        )
        if (showMore) {
            Text(
                text = review.comment,
                modifier = Modifier.padding(vertical = 2.dp),
                color = Color.DarkGray
            )
        } else {
            Text(
                text = review.comment,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(vertical = 2.dp),
                color = Color.DarkGray
            )
        }
        TextButton(
            onClick = { showMore = !showMore }, contentPadding = PaddingValues(0.dp)
        ) {
            val btnText = if (showMore) "Read Less" else "Read More"
            Text(text = btnText, color = WyndhamLightBlue)
        }
        Spacer(modifier = Modifier.size(5.dp))
        Divider(thickness = 1.dp)
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun ReviewPreview() {
    val review = Review(
        name = "Frank A",
        location = "Swansboro, North Carolina",
        rating = 1,
        reviewDate = LocalDateTime.now(),
        title = "DO NOT STAY HERE",
        comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
    )
    Review(review)
}

