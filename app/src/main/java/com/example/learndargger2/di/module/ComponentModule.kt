package com.example.learndargger2.di.module

import com.example.learndargger2.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ComponentModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
