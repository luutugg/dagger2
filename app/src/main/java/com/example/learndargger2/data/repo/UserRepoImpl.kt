package com.example.learndargger2.data.repo

import com.example.learndargger2.data.database.UserDao
import com.example.learndargger2.data.model.User
import javax.inject.Inject

class UserRepoImpl @Inject constructor(private val userDao: UserDao) : IUserRepo {

    override fun insert(user: User) {
        userDao.insertUser(user)
    }

    override fun update(user: User) {
        userDao.updateUser(user)
    }

    override fun delete(user: User) {
        userDao.deleteUser(user)
    }

    override fun getAll(): List<User> {
        return userDao.getAllUser()
    }

    override fun deleteAll() {
         userDao.deleteAll()
    }
}
