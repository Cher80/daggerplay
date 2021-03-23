package ru.detmir.arch4.repos.binding

import dagger.Subcomponent
import dagger.android.AndroidInjector
import ru.detmir.arch4.presentation.binding.LoginActivity
import ru.detmir.arch4.scopes.ActivityScope


@ActivityScope
@Subcomponent(modules = [])
interface LoginSubcomponent: AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<LoginActivity>
}