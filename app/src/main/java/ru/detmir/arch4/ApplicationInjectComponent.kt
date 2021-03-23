package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.presentation.inject.InjectActivity
import ru.detmir.arch4.repos.inject.DepA
import ru.detmir.arch4.repos.inject.DepB
import ru.detmir.arch4.repos.provide.MapsDataModule
import ru.detmir.arch4.repos.provide.PosDataModule
import ru.detmir.arch4.repos.simple.UserRepo
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationInjectComponent {
    //Это делает inject на поля которые помечены как @Inject
    fun doit(injectActivity: InjectActivity)
}