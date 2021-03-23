package ru.detmir.arch4.repos.binding2

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TheAppModule(
    val context: Context
) {
    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }
}