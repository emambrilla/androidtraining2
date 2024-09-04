package com.iesam.androidtraining2.features.login

import com.iesam.androidtraining2.features.login.data.LoginDataRepository
import com.iesam.androidtraining2.features.login.data.LoginMockRemoteDataSource
import com.iesam.androidtraining2.features.login.domain.SignInUseCase
import com.iesam.androidtraining2.features.login.presentation.LoginViewModel

class LoginFactory {

    private val loginMockRemoteDataSource: LoginMockRemoteDataSource =
        provideLoginMockRemoteDataSource()

    private val loginDataRepository: LoginDataRepository = provideLoginDataRepository()

    private val signInUseCase: SignInUseCase = provideSignInUseCase()

    // Métodos de Clase
    fun provideLoginViewModel(): LoginViewModel {
        return LoginViewModel(signInUseCase)
    }

    private fun provideLoginMockRemoteDataSource(): LoginMockRemoteDataSource {
        return LoginMockRemoteDataSource()
    }

    private fun provideLoginDataRepository(): LoginDataRepository {
        return LoginDataRepository(loginMockRemoteDataSource)
    }

    private fun provideSignInUseCase(): SignInUseCase {
        return SignInUseCase(loginDataRepository)
    }


}