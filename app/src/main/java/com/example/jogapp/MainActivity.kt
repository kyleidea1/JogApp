package com.example.jogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
                UpperSection()
                LowerSection()
            }
        }
    }
}


@Composable
fun UpperSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 12.dp
    ) {
        Column {
            CreateTitle("TSP")
            UpperScreen()
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun LowerSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 12.dp
    ) {
        Column {
            CreateTitle("Control")
            LowerScreen()
        }
    }
}

@Composable
fun CreateTitle(text: String) {
    Text(
        text = text,
        fontSize = 50.sp,
        color = Color.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    )
}