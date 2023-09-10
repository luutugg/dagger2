package com.example.learndargger2.di.module

import android.app.Application
import com.example.learndargger2.data.database.UserDao
import com.example.learndargger2.data.database.UserDatabase
import com.example.learndargger2.data.repo.IUserRepo
import com.example.learndargger2.data.repo.UserRepoImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
abstract class RepoModule  {
    @Singleton
    @Binds
    abstract fun provideUserRepo(userRepoImpl: UserRepoImpl): IUserRepo

    @Binds
    @Singleton
    abstract fun getData(zzzz: ZZZZ): XXX

    @Binds
    @Singleton
    abstract fun getData2(test2: Test2): Test22
}


abstract class XXX(application: Application){
    abstract fun ok()
}

/**
 * với việc sử dựng @Binds: cần phải inJect lớp thực hiện lớp trừu tượng để dagger biết được đối tượng thực hiện liên kết đấy
 */
class ZZZZ @Inject constructor(application: Application): XXX(application) {
    override fun ok() {

    }
}

interface Test22{}


class Test2 @Inject constructor(): Test22
