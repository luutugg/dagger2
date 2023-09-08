package com.example.learndargger2.presentation.main

import androidx.lifecycle.ViewModel
import com.example.learndargger2.data.model.User
import com.example.learndargger2.data.repo.IUserRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(private val repo: IUserRepo) : ViewModel() {

    private var _userListState = MutableStateFlow<List<User>?>(null)
    val userListState = _userListState.asStateFlow()

    fun getAllUser() {
        _userListState.value = repo.getAll()
    }
}
