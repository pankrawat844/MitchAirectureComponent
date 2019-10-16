package com.kliff.mitchairecturecomponent.session

import android.app.Application
import com.kliff.mitchairecturecomponent.persistence.AuthTokenDAO

class SessionManager
constructor(
    val authTokenDAO: AuthTokenDAO,
    val application: Application
)