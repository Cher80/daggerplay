package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.presentation.named.NamedActivity
import ru.detmir.arch4.repos.named.CatModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CatModule::class
    ]
)

interface ApplicationNamedComponent {
    fun inject(act: NamedActivity)
}