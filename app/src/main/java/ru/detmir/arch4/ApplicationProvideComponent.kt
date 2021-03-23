package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.provide.MapsDataModule
import ru.detmir.arch4.repos.provide.PosDataModule
import ru.detmir.arch4.repos.provide.Root
import ru.detmir.arch4.repos.provide.SmsDataModule
import ru.detmir.arch4.repos.simple.UserRepo
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MapsDataModule::class,
        PosDataModule::class,
        SmsDataModule::class
    ]
)

interface ApplicationProvideComponent {
    // The return type  of functions inside the
    // component interface is
    // what can be provided from the container
    fun giveMeRoot(): Root
}