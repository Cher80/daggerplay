package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.presentation.inject.InjectActivity
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationInjectComponent {
    //Это делает inject на поля которые помечены как @Inject
    fun doit(injectActivity: InjectActivity)
}