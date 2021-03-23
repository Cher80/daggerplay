package ru.detmir.arch4.presentation.binding2

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.detmir.arch4.scopes.ActivityScope

@Module
class TheLoginViewModelModule {
    @ActivityScope
    @Provides
    fun provideTheLoginViewModel(context: Context): TheLoginViewModel {
        return TheLoginViewModel(context)
    }
}