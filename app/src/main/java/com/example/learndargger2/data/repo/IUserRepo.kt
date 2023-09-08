package com.example.learndargger2.data.repo

import com.example.learndargger2.data.model.User

interface IUserRepo {
    fun insert(user: User)
    fun update(user: User)
    fun delete(user: User)
    fun getAll(): List<User>
    fun deleteAll()
}
