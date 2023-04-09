package com.example.solvedacgrass

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * 로그인 화면
 *
 * Created by fac.toriall on 2023.04.03..
 */
@Composable
fun LoginScreen(modifier: Modifier, onLoginSuccess: () -> Unit) {
    Box(modifier.fillMaxSize()) {
        Text(text = "Login", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
@Preview
fun LoginScreenPreview() {
    LoginScreen(Modifier, {})
}
