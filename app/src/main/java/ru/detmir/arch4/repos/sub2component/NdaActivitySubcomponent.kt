package ru.detmir.arch4.repos.sub2component

import dagger.Subcomponent
import ru.detmir.arch4.presentation.sub2component.Sub2ComponentActivity

@Subcomponent(modules = [NdaActivityModule::class])
interface NdaActivitySubcomponent {
    fun inject(sub2ComponentActivity: Sub2ComponentActivity)

    @Subcomponent.Builder
    interface Builder {
        // The below module injection API is option if the
        // ChildModule doesn't take parameter.
        // But it is required if the Child module need to have
        // parameter
        fun childModule(ndaActivityModule: NdaActivityModule): Builder
        fun build(): NdaActivitySubcomponent
    }
}