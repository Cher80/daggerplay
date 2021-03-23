package ru.detmir.arch4.repos.binding

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
    val context: Context
) {
    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }
}