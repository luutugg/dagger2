package com.example.learndargger2.presentation.update

import androidx.lifecycle.ViewModel
import com.example.learndargger2.data.model.User
import com.example.learndargger2.data.repo.IUserRepo

class UpdateViewModel constructor(private val repo: IUserRepo): ViewModel() {
    fun insertUser(userName: String){
        repo.insert(User(name = userName, image = "https://adoreyou.vn/wp-content/uploads/cute-hot-girl-700x961.jpg"))
    }
}
