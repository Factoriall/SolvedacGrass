package com.example.solvedacgrass

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

/**
 * 로그인 화면
 *
 * Created by fac.toriall on 2023.04.03..
 */
@Composable
fun LoginScreen(modifier: Modifier, viewModel: LoginViewModel, onLoginSuccess: () -> Unit) {
    val usernameText = viewModel.username.collectAsState().value

    Box(modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource(id = R.drawable.solvedac_logo_no_back),
                contentDescription = null
            )
            TextField(value = usernameText, onValueChange = {
                viewModel.updateIdText(it)
            }, label = { Text("solved.ac에서 사용하는 아이디를 입력하세요.") })
        }
    }
}

@Composable
@Preview
fun LoginScreenPreview() {
    LoginScreen(Modifier, LoginViewModel()) {}
}
