package com.example.wyndhamcompose.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun formatDate(date: LocalDateTime) = date.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"))