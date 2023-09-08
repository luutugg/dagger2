package com.example.learndargger2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.learndargger2.data.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase: RoomDatabase() {
    abstract fun getUserDao(): UserDao
}
