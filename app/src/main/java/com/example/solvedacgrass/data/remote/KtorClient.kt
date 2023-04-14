package com.example.solvedacgrass.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.request.get
import io.ktor.http.Parameters
import io.ktor.http.isSuccess

/**
 * 클래스에 대한 간단한 설명이나 참고 url을 남겨주세요.
 * Created by fac.toriall on 2023.04.14..
 */

object KtorClient {
    private val client = HttpClient(OkHttp)

    suspend fun getUserInfo(username: String, password: String) : Boolean{
        val params = Parameters.build {
            append("username", username)
        }

        val response = client.get("$url/$username")
        return response.status.isSuccess()
    }

    const val url = "https://solved.ac/api/v3"
}