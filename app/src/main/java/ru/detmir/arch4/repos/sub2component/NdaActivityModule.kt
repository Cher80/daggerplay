package ru.detmir.arch4.repos.sub2component

import dagger.Module
import dagger.Provides

@Module
class NdaActivityModule(
    val name: String
) {

    @Provides
    fun getBilActivityViewModel(
        zContext: ZContext
    ): NdaActivityViewModel {
        return NdaActivityViewModel(zContext, name)
    }
}