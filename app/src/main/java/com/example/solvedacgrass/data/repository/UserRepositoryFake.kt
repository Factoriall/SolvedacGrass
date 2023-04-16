package com.example.solvedacgrass.data.repository

import com.example.solvedacgrass.domain.model.Handle
import com.example.solvedacgrass.domain.repository.UserRepository

/**
 * Preview에 사용될 가짜 UserRepository
 *
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