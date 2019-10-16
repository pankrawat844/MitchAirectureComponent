package com.kliff.mitchairecturecomponent.ui.auth

import androidx.lifecycle.ViewModel
import com.kliff.mitchairecturecomponent.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
) : ViewModel() {

}