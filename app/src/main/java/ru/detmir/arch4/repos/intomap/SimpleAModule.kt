package ru.detmir.arch4.repos.intomap

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class SimpleAModule {
    @Provides
    @IntoMap
    @StringKey("A")
    fun getSimpleA(): String {
        return "simpleA"
    }
}