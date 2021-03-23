package ru.detmir.arch4.repos.intomap

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class SimpleBModule {
    @Provides
    @IntoMap
    @StringKey("B")
    fun getSimpleB(): String {
        return "simpleB"
    }
}