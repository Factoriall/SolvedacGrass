package com.example.solvedacgrass.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.solvedacgrass.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.14..
 */
@HiltViewModel
class LoginViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
    private val _username: MutableStateFlow<String> = MutableStateFlow("")
    val username: StateFlow<String> = _username.asStateFlow()

    fun updateIdText(newId: String) {
        _username.value = newId
    }

    fun checkLogin(onLoginSuccess: () -> Unit, onLoginFail: () -> Unit) {
        viewModelScope.launch {
            if (userRepository.getFetchUserInfoResult(username.value)) {
                onLoginSuccess.invoke()
            } else {
                onLoginFail.invoke()
            }
        }
    }
}