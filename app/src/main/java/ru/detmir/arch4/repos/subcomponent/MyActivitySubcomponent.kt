package ru.detmir.arch4.repos.subcomponent

import dagger.Subcomponent
import ru.detmir.arch4.presentation.subcomponent.SubComponentActivity

@Subcomponent(modules = [MyActivityModule::class])
interface MyActivitySubcomponent {
    fun inject(subComponentActivity: SubComponentActivity)
    //fun giveMyActivityViewModel(): MyActivityViewModel
}