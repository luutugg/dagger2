package com.example.learndargger2.di.module

import android.app.Application
import com.example.learndargger2.data.model.Test
import com.example.learndargger2.data.model.User
import dagger.Module
import dagger.Provides

@Module
class TestModule {
    @Provides
    fun getContext(application: Application): Test {
        return Test(application)
    }
}
