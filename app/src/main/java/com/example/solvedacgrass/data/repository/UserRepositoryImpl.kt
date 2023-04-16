package com.example.solvedacgrass.data.repository

import com.example.solvedacgrass.data.remote.LoginApi
import com.example.solvedacgrass.domain.model.Handle
import com.example.solvedacgrass.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 실 서비스에 사용되는 UserRepository
 *
 * Created by fac.toriall on 2023.04.16..
 */
@Singleton
class UserRepositoryImpl @Inject constructor(private val api: LoginApi) : UserRepository {
    private var handle: Handle? = null
    override suspend fun getFetchUserInfoResult(username: String): Boolean {
        return try {
            val handle = api.fetchUserInfo(username)
            this.handle = handle
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    override fun getUserInfo(): Handle? {
        return handle
    }

}