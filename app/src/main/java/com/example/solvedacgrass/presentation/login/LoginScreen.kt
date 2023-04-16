package com.example.solvedacgrass.presentation.login

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.TextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.solvedacgrass.R
import com.example.solvedacgrass.data.repository.UserRepositoryFake

/**
 * 로그인 화면
 *
 * Created by fac.toriall on 2023.04.03..
 */
@Composable
fun LoginScreen(modifier: Modifier, viewModel: LoginViewModel, onLoginSuccess: () -> Unit) {
    val usernameText = viewModel.username.collectAsState().value
    val context = LocalContext.current

    Box(modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.solvedac_logo_no_back),
                contentDescription = null
            )
            TextField(
                value = usernameText,
                onValueChange = {
                    viewModel.updateIdText(it)
                }, label = { Text("solved.ac에서 사용하는 아이디를 입력하세요.") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {
                viewModel.checkLogin(onLoginSuccess = {
                    onLoginSuccess.invoke()
                }, onLoginFail = {
                    Toast.makeText(context, "로그인 실패! 아이디를 다시 입력하세요.", Toast.LENGTH_LONG).show()
                })
            }) {
                Text(text = "로그인")
            }
        }
    }
}

@Composable
@Preview
fun LoginScreenPreview() {
    LoginScreen(Modifier, LoginViewModel(UserRepositoryFake())) {}
}
