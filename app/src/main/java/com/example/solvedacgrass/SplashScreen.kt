package com.example.solvedacgrass

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

/**
 * 스플래시 화면
 *
 * Created by fac.toriall on 2023.04.03..
 */
@Composable
fun SplashScreen(modifier: Modifier, onFinishSplash: () -> Unit) {
    Box(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.solvedac_logo_no_back),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center)
        )

        Text(
            text = "ALGO UP",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
            fontSize = 30.sp
        )
    }
    val splashTime = 2000L
    LaunchedEffect(Unit) {
        delay(splashTime)
        onFinishSplash.invoke()
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    SplashScreen(Modifier, {})
}