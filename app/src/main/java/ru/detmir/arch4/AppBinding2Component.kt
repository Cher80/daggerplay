package ru.detmir.arch4

import dagger.Component
import dagger.android.AndroidInjectionModule
import ru.detmir.arch4.repos.binding2.TheAppModule
import ru.detmir.arch4.repos.binding2.TheBindingModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        TheBindingModule::class,
        TheAppModule::class
    ]
)

interface AppBinding2Component {
    fun inject(application: App)
}