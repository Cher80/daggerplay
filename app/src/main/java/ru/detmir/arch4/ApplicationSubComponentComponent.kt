package ru.detmir.arch4

import dagger.Component
import ru.detmir.arch4.repos.subcomponent.BilActivitySubcomponent
import ru.detmir.arch4.repos.subcomponent.MyActivityModule
import ru.detmir.arch4.repos.subcomponent.MyActivitySubcomponent
import ru.detmir.arch4.repos.subcomponent.MyContextModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MyContextModule::class
    ]
)

interface ApplicationSubComponentComponent {
    fun getMyActivitySubComponent(myActivityModule: MyActivityModule): MyActivitySubcomponent
    fun getBilActivitySubComponentBuilder(): BilActivitySubcomponent.Builder
}