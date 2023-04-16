package com.example.solvedacgrass.data.remote

import com.example.solvedacgrass.data.remote.KtorClient.url
import com.example.solvedacgrass.domain.model.Handle
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.path

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.15..
 */
object LoginApi {
    suspend fun fetchUserInfo(username: String): Handle {
        val response = KtorClient.client.get(url) {
            url {
                path("/user/show")
                parameters.append("handle", username)
            }
        }.body<Handle>()

        return response
    }
}