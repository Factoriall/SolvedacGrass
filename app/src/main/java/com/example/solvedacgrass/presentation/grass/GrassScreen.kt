package com.example.solvedacgrass.presentation.grass

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.03..
 */
@Composable
fun GrassScreen(modifier: Modifier) {
    Box(modifier = modifier) {
        Text(text = "잔디 화면", modifier = Modifier.align(Alignment.Center))
    }
}