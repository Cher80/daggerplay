package ru.detmir.arch4.repos.subcomponent

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyContextModule() {

    @Provides
    @Singleton
    fun getMyContext(): MyContext {
        return MyContext("cont")
    }
}