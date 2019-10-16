package com.kliff.mitchairecturecomponent.repository.auth

import com.kliff.mitchairecturecomponent.api.auth.OpenApiAuthService
import com.kliff.mitchairecturecomponent.persistence.AccountPropertiesDAO
import com.kliff.mitchairecturecomponent.persistence.AuthTokenDAO
import com.kliff.mitchairecturecomponent.session.SessionManager

class AuthRepository
constructor(
    val authTokenDAO: AuthTokenDAO,
    accountPropertiesDAO: AccountPropertiesDAO,
    openApiAuthService: OpenApiAuthService,
    sessionManager: SessionManager
)