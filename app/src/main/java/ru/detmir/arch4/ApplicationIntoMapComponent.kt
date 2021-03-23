package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.presentation.intomap.IntomapActivity
import ru.detmir.arch4.repos.intomap.*
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        SimpleAModule::class,
        SimpleBModule::class,
        LocModule::class
    ]
)

interface ApplicationIntoMapComponent {
    // The return type  of functions inside the
    // component interface is
    // what can be provided from the container
    fun giveMap(): Map<String, String>
    fun giveLocMap(): @JvmSuppressWildcards Map<Class<out Loc>, @JvmSuppressWildcards Loc>
    fun inject(act: IntomapActivity)
}