package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.simple.UserRepo
import ru.detmir.arch4.repos.simplesingleton.GoodsRepo
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationSimpleSingletonComponent {
    // The return type  of functions inside the
    // component interface is
    // what can be provided from the container
    fun giveMeGoodsRepo(): GoodsRepo
}