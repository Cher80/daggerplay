package ru.detmir.arch4.repos.binding

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import ru.detmir.arch4.presentation.binding.LoginActivity


@Module(subcomponents = [LoginSubcomponent::class])
abstract class LoginSubcomponentModule {
    @Binds
    @IntoMap
    @ClassKey(LoginActivity::class)
    abstract fun bindYourAndroidInjectorFactory(f: LoginSubcomponent.Factory): AndroidInjector.Factory<*>
}