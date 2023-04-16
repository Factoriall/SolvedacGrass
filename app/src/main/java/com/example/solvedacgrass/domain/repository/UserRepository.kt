package com.example.solvedacgrass.domain.repository

import com.example.solvedacgrass.domain.model.Handle

/**
 * Created by fac.toriall on 2023.04.16..
 */
interface UserRepository {
    suspend fun getFetchUserInfoResult(username: String) : Boolean
    fun getUserInfo() : Handle?
}