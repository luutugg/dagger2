package com.example.learndargger2.di.component

import android.app.Application
import com.example.learndargger2.UserApplication
import com.example.learndargger2.presentation.main.MainActivity
import dagger.android.AndroidInjector

class AppComponent:AndroidInjector<MainActivity> {

    override fun inject(instance: MainActivity?) {

    }
}
