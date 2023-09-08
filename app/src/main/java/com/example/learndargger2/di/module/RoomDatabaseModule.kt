package com.example.learndargger2.di.module

import android.app.Application
import androidx.room.Room
import com.example.learndargger2.data.database.UserDao
import com.example.learndargger2.data.database.UserDatabase
import com.example.learndargger2.data.repo.IUserRepo
import com.example.learndargger2.data.repo.UserRepoImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomDatabaseModule {
    @Singleton
    @Provides
    fun provideUserRoomDatabase(application: Application): UserDatabase {
        return Room.databaseBuilder(
            application,
            UserDatabase::class.java,
            UserDatabase::class.java.simpleName
        ).allowMainThreadQueries().build()
    }

    @Singleton
    @Provides
    fun provideUserDao(userDatabase: UserDatabase): UserDao {
        return userDatabase.getUserDao()
    }
}
