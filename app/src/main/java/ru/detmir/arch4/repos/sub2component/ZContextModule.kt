package ru.detmir.arch4.repos.sub2component

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ZContextModule() {

    @Provides
    @Singleton
    fun getZContext(): ZContext {
        return ZContext("cont")
    }
}