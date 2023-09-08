package com.example.learndargger2.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.learndargger2.data.model.User

@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("select * from user")
    fun getAllUser(): List<User>

    @Query("DELETE FROM user")
    fun deleteAll()
}
