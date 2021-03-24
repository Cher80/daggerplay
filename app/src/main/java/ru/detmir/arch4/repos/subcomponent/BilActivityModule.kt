package ru.detmir.arch4.repos.subcomponent

import dagger.Module
import dagger.Provides
import ru.detmir.arch4.scopes.ActivityScope
import ru.detmir.arch4.scopes.FragmentScope

@Module
class BilActivityModule(
    val name: String
) {

    @ActivityScope
    @Provides
    fun getBilActivityViewModel(
        myContext: MyContext
    ): BilActivityViewModel {
        return BilActivityViewModel(myContext, name)
    }
}