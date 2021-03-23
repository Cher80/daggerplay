package ru.detmir.arch4.repos.binding2

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.detmir.arch4.presentation.binding2.TheLoginActivity
import ru.detmir.arch4.presentation.binding2.TheLoginViewModelModule
import ru.detmir.arch4.scopes.ActivityScope


@Module
abstract class TheBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [TheLoginViewModelModule::class])
    abstract fun theLoginActivity(): TheLoginActivity
}