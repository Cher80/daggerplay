package ru.detmir.arch4.repos.provide

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MapsDataModule {
    @Provides
    @Singleton
    fun getMoscowMapsData(base: Base): MoscowMapsData {
        return MoscowMapsDataImpl(
            base = base
        )
    }

    @Provides
    @Singleton
    fun getPiterMapsData(base: Base): PiterMapsData {
        return PiterMapsDataImpl(
            base = base
        )
    }
}