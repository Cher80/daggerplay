package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.provide.MapsDataModule
import ru.detmir.arch4.repos.provide.PosDataModule
import ru.detmir.arch4.repos.simple.UserRepo
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MapsDataModule::class,
        PosDataModule::class
    ]
)
interface ApplicationComponent {
    // The return type  of functions inside the component interface is
    // what can be provided from the container
    fun repository(): UserRepo

    //Это делает inject на поля которые помечены как @Inject
    fun doit(mainActivity: MainActivity)
}