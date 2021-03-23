package ru.detmir.arch4

import dagger.Component
import dagger.android.AndroidInjectionModule
import ru.detmir.arch4.repos.binding.AppModule
import ru.detmir.arch4.repos.binding.LoginSubcomponentModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        LoginSubcomponentModule::class,
        AppModule::class
    ]
)

interface AppBindingComponent {
    fun inject(application: App)
}