package com.example.solvedacgrass.data.repository

import com.example.solvedacgrass.domain.model.Handle
import com.example.solvedacgrass.domain.repository.UserRepository

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.16..
 */
class UserRepositoryFake : UserRepository {
    override suspend fun getFetchUserInfoResult(username: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getUserInfo(): Handle? {
        TODO("Not yet implemented")
    }
}