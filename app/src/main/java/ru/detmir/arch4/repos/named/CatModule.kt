package ru.detmir.arch4.repos.named

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CatModule {
    @Provides
    @Named("AAA")
    fun getCatA(): Cat {
        return Cat("AAA")
    }

    @Provides
    @Named("BBB")
    fun getCatB(): Cat {
        return Cat("BBB")
    }
}