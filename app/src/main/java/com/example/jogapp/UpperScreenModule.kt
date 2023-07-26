package com.example.jogapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import java.time.Year

@Composable
fun UpperScreen() {
    Box {
        Column {
            Column {
                Row {
                    //X
                    //Y
                    //Z
                }
                Row {
                    //RX
                    //RY
                    //RZ
                }
            }
            Column {
                Row() {
                    //Joint1
                    //Joint2
                    //Joint3
                }
                Row {
                    //Joint4
                    //Joint5
                    //Joint6
                }
            }
            Row {
                //미세 제어
                //이동 거리
                //회전 각도
            }
        }
    }
}