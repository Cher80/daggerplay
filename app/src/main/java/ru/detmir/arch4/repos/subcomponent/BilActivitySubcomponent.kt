package ru.detmir.arch4.repos.subcomponent

import dagger.Subcomponent
import ru.detmir.arch4.scopes.ActivityScope
import ru.detmir.arch4.scopes.FragmentScope

@ActivityScope
@Subcomponent(modules = [BilActivityModule::class])
interface BilActivitySubcomponent {
    fun giveBilActivityViewModel(): BilActivityViewModel

    @Subcomponent.Builder
    interface Builder {
        fun childModule(bilActivityModule: BilActivityModule): Builder
        fun build(): BilActivitySubcomponent
    }
}