package com.example.learndargger2

import android.app.Application
import com.example.learndargger2.di.component.DaggerUserComponent
import com.example.learndargger2.di.component.UserComponent

class UserApplication : Application() {

    companion object {
        lateinit var instance: UserApplication
    }

    lateinit var userComponent: UserComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        userComponent = DaggerUserComponent.builder().application(this).build()
    }
}
