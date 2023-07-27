package com.example.jogapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CreateButton(drawableId: Int, x: Int, y: Int, s: Float, onClick: () -> Unit) {
    val image: Painter = painterResource(id = drawableId)
    val imageModifier = Modifier
        .offset(x.dp, y.dp)
        .scale(s)
        .clickable { onClick() }

    CreateImage(image, imageModifier)
}

@Composable
fun CreateImage(image: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun InsertImage(drawableId: Int, x: Int, y: Int, s: Float) {
    val image: Painter = painterResource(id = drawableId)
    val imageModifier = Modifier
        .offset(x.dp, y.dp)
        .scale(s)
    CreateImage(image, imageModifier)
}

@Composable
fun MySwitch() {
    val (selection, setSelection) = remember { mutableStateOf(true) }

    Column {
        Image(
            painter = if (selection) painterResource(id = R.drawable.selectedtcpbtn) else painterResource(id = R.drawable.unselectedtcpbtn),
            contentDescription = "TCP",
            modifier = Modifier
                .size(145.dp)
                .clickable { setSelection(true) }
        )

        Image(
            painter = if (!selection) painterResource(id = R.drawable.selectedbasebtn) else painterResource(id = R.drawable.unselectedbasebtn),
            contentDescription = "Base",
            modifier = Modifier
                .size(145.dp)
                .clickable { setSelection(false) }
        )
    }
}


