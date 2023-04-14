package com.example.solvedacgrass

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.14..
 */
@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {
    private val _id: MutableStateFlow<String> = MutableStateFlow("")
    val username: StateFlow<String> = _id.asStateFlow()
    private val _pwd: MutableStateFlow<String> = MutableStateFlow("")
    val pwd: StateFlow<String> = _pwd.asStateFlow()

    fun updateIdText(newId: String) {
        _id.value = newId
    }

    fun updatePasswordText(newPassword: String) {
        _pwd.value = newPassword
    }

    fun checkLogin() {

    }
}