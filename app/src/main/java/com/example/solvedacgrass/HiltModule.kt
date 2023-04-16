package com.example.solvedacgrass

import com.example.solvedacgrass.data.remote.LoginApi
import com.example.solvedacgrass.data.repository.UserRepositoryImpl
import com.example.solvedacgrass.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Hilt 의존성 주입을 위한 모듈 클래스
 *
 * Created by fac.toriall on 2023.04.16..
 */
@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideUserRepository(
        api: LoginApi,
    ): UserRepository = UserRepositoryImpl(api)
}

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    fun provideLoginApi() = LoginApi
}