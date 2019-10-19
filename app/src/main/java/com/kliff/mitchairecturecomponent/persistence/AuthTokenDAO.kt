package com.kliff.mitchairecturecomponent.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kliff.mitchairecturecomponent.models.AuthToken

@Dao
interface AuthTokenDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAuthToken(authToken: AuthToken): Long

    @Query("update auth_token set token=null where account_pk=:pk")
    fun nullifyToken(pk: Int): Int
}