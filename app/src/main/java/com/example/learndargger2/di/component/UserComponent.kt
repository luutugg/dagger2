package com.example.learndargger2.di.component

import android.app.Application
import com.example.learndargger2.di.module.RepoModule
import com.example.learndargger2.di.module.RoomDatabaseModule
import com.example.learndargger2.presentation.main.MainActivity
import com.example.learndargger2.presentation.update.UpdateActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RoomDatabaseModule::class, RepoModule::class])
interface UserComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(updateActivity: UpdateActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): UserComponent
    }
}
