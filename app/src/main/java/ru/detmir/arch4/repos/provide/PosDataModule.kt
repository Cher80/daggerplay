package ru.detmir.arch4.repos.provide

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PosDataModule {
    @Provides
    @Singleton
    fun getPPosData(base: Base): PosData {
        return PosDataImpl(
            base = base
        )
    }
}