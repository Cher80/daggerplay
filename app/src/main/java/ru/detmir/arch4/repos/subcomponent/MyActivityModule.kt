package ru.detmir.arch4.repos.subcomponent

import dagger.Module
import dagger.Provides

@Module
class MyActivityModule(val name: String) {

    @Provides
    fun getMyActivityViewModel(
        myContext: MyContext
    ): MyActivityViewModel {
        return MyActivityViewModel(myContext, name)
    }
}