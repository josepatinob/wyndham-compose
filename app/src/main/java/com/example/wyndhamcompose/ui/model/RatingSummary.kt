package com.example.wyndhamcompose.ui.model

data class RatingSummary(val category: String, val rating: Int) {
    companion object {
        val ratingSummaryList = listOf(
            RatingSummary("Location", 3),
            RatingSummary("Sleep Quality", 3),
            RatingSummary("Rooms", 2),
            RatingSummary("Service", 4),
            RatingSummary("Cleanliness", 3)
        )
    }
}
