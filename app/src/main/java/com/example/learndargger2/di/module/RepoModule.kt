package com.example.learndargger2.di.module

import com.example.learndargger2.data.database.UserDao
import com.example.learndargger2.data.database.UserDatabase
import com.example.learndargger2.data.repo.IUserRepo
import com.example.learndargger2.data.repo.UserRepoImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class RepoModule {
    @Singleton
    @Binds
    abstract fun provideUserRepo(userRepoImpl: UserRepoImpl): IUserRepo
}
