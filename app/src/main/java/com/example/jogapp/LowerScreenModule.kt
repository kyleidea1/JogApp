package com.example.jogapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun LowerScreen() {
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(350.dp, 260.dp)
        ) {
            CreateButton(R.drawable.forward, 110, 0, 1.2f) {
                // Implement action here
            }
            CreateButton(R.drawable.backward, 100, 180, 1.2f) {
                // Implement action here
            }
            CreateButton(R.drawable.left, 0, 80, 1.2f) {
                // Implement action here
            }
            CreateButton(R.drawable.right, 235, 80, 1.2f) {
                // Implement action here
            }
        }
        Column(
            Modifier.height(260.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            CreateButton(R.drawable.up, 0,0,1.1f) {

            }
            CreateButton(R.drawable.down, 0, 0, 1.1f) {

            }
        }
        Box(
            modifier = Modifier
                .size(350.dp, 260.dp)
        ) {
            InsertImage(R.drawable.xaxis, 110, 90, 1.0f)
            CreateButton(R.drawable.xminus,60,130,1.0f) {

            }
            CreateButton(R.drawable.xplus,60,0,1.0f) {

            }
        }
        Box(
            modifier = Modifier
                .size(350.dp, 260.dp)
        ) {
            InsertImage(R.drawable.zaxis, 140, 90 ,1.0f)
            CreateButton(R.drawable.zminus,32,40,1.0f) {

            }
            CreateButton(R.drawable.zplus,173,40,1.0f) {

            }
        }
        Box(
            modifier = Modifier
                .size(350.dp, 260.dp)
        ) {
            InsertImage(R.drawable.yaxis, 110, 90 ,1.0f)
            CreateButton(R.drawable.yminus,160,0,1.0f) {

            }
            CreateButton(R.drawable.yplus,160,130,1.0f) {

            }
        }
    }
}

