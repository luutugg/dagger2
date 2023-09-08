package com.example.learndargger2.di.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learndargger2.data.repo.IUserRepo
import com.example.learndargger2.presentation.main.MainViewModel
import com.example.learndargger2.presentation.update.UpdateViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ViewModelFactory @Inject constructor(private val repo: IUserRepo) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        with(modelClass) {
            when {
                isAssignableFrom(MainViewModel::class.java) -> {
                    MainViewModel(repo)
                }

                isAssignableFrom(UpdateViewModel::class.java) -> {
                    UpdateViewModel(repo)
                }
                else -> throw IllegalStateException("unknown view model: $modelClass")
            }
        } as T
}
