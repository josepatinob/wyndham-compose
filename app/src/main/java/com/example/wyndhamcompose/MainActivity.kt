package com.example.wyndhamcompose

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.wyndhamcompose.ui.screens.ReviewDetails
import com.example.wyndhamcompose.ui.theme.WyndhamBlue
import com.example.wyndhamcompose.ui.theme.WyndhamComposeTheme


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WyndhamComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Home() {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                backgroundColor = White,
                title = {
                    Text(
                        text = "Reviews",
                        fontSize = 16.sp,
                        color = Gray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(.80f)
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            /* Do Nothing */
                        }
                    ) {
                        Icon(
                            Icons.Filled.ChevronLeft,
                            contentDescription = "Back Arrow",
                            tint = WyndhamBlue
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            ReviewDetails()
        }
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun HomePreview() {
    Home()
}