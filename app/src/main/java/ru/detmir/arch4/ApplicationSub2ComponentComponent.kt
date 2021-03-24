package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.sub2component.NdaActivitySubcomponent
import ru.detmir.arch4.repos.sub2component.NdaParentModule
import ru.detmir.arch4.repos.sub2component.ZContextModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ZContextModule::class,
        NdaParentModule::class
    ]
)

interface ApplicationSub2ComponentComponent {
    fun getNdaActivitySubcomponent(): NdaActivitySubcomponent.Builder
}