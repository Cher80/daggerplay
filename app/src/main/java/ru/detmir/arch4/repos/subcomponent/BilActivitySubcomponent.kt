package ru.detmir.arch4.repos.subcomponent

import dagger.Subcomponent
import ru.detmir.arch4.scopes.FragmentScope

@FragmentScope
@Subcomponent(modules = [BilActivityModule::class])
interface BilActivitySubcomponent {
    fun giveBilActivityViewModel(): BilActivityViewModel

    @Subcomponent.Builder
    interface Builder {
        // The below module injection API is option if the
        // ChildModule doesn't take parameter.
        // But it is required if the Child module need to have
        // parameter
        fun childModule(bilActivityModule: BilActivityModule): Builder
        fun build(): BilActivitySubcomponent
    }
}