package ru.detmir.arch4.repos.intomap

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class LocModule {
    @Provides
    @IntoMap
    @LocMapKey(LocA::class)
    fun getLocA(): Loc {
        return LocA()
    }

    @Provides
    @IntoMap
    @LocMapKey(LocB::class)
    fun getLocB(): Loc {
        return LocB()
    }
}