package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.doublesingleton.CatRepo
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationDoubleSingletonComponent {
    // The return type  of functions inside the
    // component interface is
    // what can be provided from the container
    fun giveMeCatRepo(): CatRepo
}