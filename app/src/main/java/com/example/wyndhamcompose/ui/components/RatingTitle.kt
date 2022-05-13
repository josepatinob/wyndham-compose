package com.example.wyndhamcompose.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RatingTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = title,
        fontSize = 19.sp,
        color = Color.DarkGray,
        modifier = modifier,
        fontWeight = FontWeight.Light
    )
}

@Composable
@Preview(showBackground = true)
fun RatingTitlePreview() {
    RatingTitle("Hello World")
}