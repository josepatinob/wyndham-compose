package com.example.wyndhamcompose.ui.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

data class Review(
    val name: String,
    val location: String,
    val rating: Int,
    val reviewDate: LocalDateTime,
    val title: String,
    val comment: String
) {
    companion object {
        @RequiresApi(Build.VERSION_CODES.O)
        val recentReviewsList = listOf(
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            ),
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            ),
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            ),
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            ),
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            ),
            Review(
                name = "Frank A",
                location = "Swansboro, North Carolina",
                rating = 1,
                reviewDate = LocalDateTime.now(),
                title = "DO NOT STAY HERE",
                comment = """
                    There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.
                """.trimIndent()
            )
        )
    }
}