package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.simple.UserRepo

@Component()
interface ApplicationSimpleComponent {
    // The return type  of functions inside the
    // component interface is
    // what can be provided from the container
    fun giveMeUserRepo(): UserRepo
}