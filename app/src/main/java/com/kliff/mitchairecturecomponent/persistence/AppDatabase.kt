package com.kliff.mitchairecturecomponent.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kliff.mitchairecturecomponent.models.AccountProperties
import com.kliff.mitchairecturecomponent.models.AuthToken

@Database(
    entities = [AuthToken::class, AccountProperties::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getAuthTokenDAO(): AuthTokenDAO
    abstract fun getAccountPropertiesDAO(): AccountPropertiesDAO

    companion object {
        const val DATABASE_NAme = "app_database"
    }
}