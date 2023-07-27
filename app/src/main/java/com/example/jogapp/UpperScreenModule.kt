package com.example.jogapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogapp.ui.theme.MyGreen
import com.example.jogapp.ui.theme.MyRed

import java.time.Year

@Composable
fun UpperScreen() {
    val tcp = TCP()  // This is a temporary code for testing and should be replaced with the actual data from the server.

    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                CustomTextField(label = "X", value = tcp.x.toString())
                CustomTextField(label = "Y", value = tcp.y.toString())
                CustomTextField(label = "Z", value = tcp.z.toString())
            }
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                CustomTextField(label = "RX", value = tcp.rx.toString())
                CustomTextField(label = "RY", value = tcp.ry.toString())
                CustomTextField(label = "RZ", value = tcp.rz.toString())
            }

            // Now using the JointCard component to display the joints
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                JointCard(label = "Joint1")
                JointCard(label = "Joint2")
                JointCard(label = "Joint3")
            }
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                JointCard(label = "Joint4")
                JointCard(label = "Joint5")
                JointCard(label = "Joint6")
            }
        }
    }
}



@Composable
fun CustomTextField(label: String, value: String) {
    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = 8.dp,
        modifier = Modifier
            .padding(8.dp)
            .width(400.dp)
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier.padding(1.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = label,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
                fontSize = 50.sp, // Adjust the font size here
                textAlign = TextAlign.Center // Adjust the text alignment here
            )
            Text(
                text = value,
                modifier = Modifier.weight(2f),
                fontSize = 50.sp, // Adjust the font size here
                textAlign = TextAlign.Center // Adjust the text alignment here
            )
        }
    }
}

@Composable
fun JointCard(label: String) {
    val jointValue = remember { mutableStateOf(0.0) }

    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = 8.dp,
        modifier = Modifier
            .padding(8.dp)
            .width(400.dp)
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier.padding(1.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MinusButton()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = label,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "%.2f".format(jointValue.value),
                    fontSize = 56.sp,
                    textAlign = TextAlign.Center
                )
            }
            PlusButton()
        }
    }
}

@Composable
fun MinusButton() {
    Button(
        onClick = { /* Do nothing */ },
        modifier = Modifier.size(80.dp),
        shape = RoundedCornerShape(40.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black
        ),
        elevation = ButtonDefaults.elevation(8.dp)
    ) {
        Text(
            "-",
            fontSize = 50.sp
        )
    }
}

@Composable
fun PlusButton() {
    Button(
        onClick = { /* Do nothing */ },
        modifier = Modifier.size(80.dp),
        shape = RoundedCornerShape(40.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black
        ),
        elevation = ButtonDefaults.elevation(8.dp)
    ) {
        Text(
            "+",
            fontSize = 50.sp
        )
    }
}




