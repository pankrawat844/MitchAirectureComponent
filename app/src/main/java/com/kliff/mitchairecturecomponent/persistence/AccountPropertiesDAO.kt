package com.kliff.mitchairecturecomponent.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kliff.mitchairecturecomponent.models.AccountProperties

@Dao
interface AccountPropertiesDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertnReplace(accountProperties: AccountProperties): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertorIgnore(accountProperties: AccountProperties): Long

    @Query("select * from account_properties where pk=:pk")
    fun searchbyPk(pk: Int): AccountProperties?

    @Query("select * from account_properties where email=:email")
    fun searchbyEmail(email: String): AccountProperties?
}