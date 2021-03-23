package ru.detmir.arch4

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import ru.detmir.arch4.repos.binding.AppModule
import ru.detmir.arch4.repos.binding2.TheAppModule
import ru.detmir.arch4.utils.L
import javax.inject.Inject

class App: Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        L.d("ooo")
        initSimpleDagger()
        initSimpleSingletonDagger()
        initDoubleSingletonDagger()
        initProvideDagger()
        initInjectDagger()
        initIntomapDagger()
        initNamedDagger()
        initSubComponentDagger()
        initSub2ComponentDagger()
        initBindingDagger()
        initBinding2Dagger()

        super.onCreate()
    }

    private fun initSimpleDagger() {
        applicationSimpleComponent = DaggerApplicationSimpleComponent.create()
    }


    private fun initSimpleSingletonDagger() {
        applicationSimpleSingletonComponent = DaggerApplicationSimpleSingletonComponent.create()
    }


    private fun initDoubleSingletonDagger() {
        applicationDoubleSingletonComponent = DaggerApplicationDoubleSingletonComponent.create()
    }

    private fun initProvideDagger() {
        applicationProvideComponent = DaggerApplicationProvideComponent.create()
    }

    private fun initInjectDagger() {
        applicationInjectComponent = DaggerApplicationInjectComponent.create()
    }

    private fun initIntomapDagger() {
        applicationIntoMapComponent = DaggerApplicationIntoMapComponent.create()
    }


    private fun initNamedDagger() {
        applicationNamedComponent = DaggerApplicationNamedComponent.create()
    }

    private fun initSubComponentDagger() {
        applicationSubComponentComponent = DaggerApplicationSubComponentComponent.create()
    }

    private fun initSub2ComponentDagger() {
        applicationSub2ComponentComponent = DaggerApplicationSub2ComponentComponent.create()
    }

    private fun initBindingDagger() {
        applicationBindingsComponent = DaggerAppBindingComponent.builder().appModule(AppModule(applicationContext)).build()
        applicationBindingsComponent.inject(this)
    }

    private fun initBinding2Dagger() {
        applicationBindings2Component = DaggerAppBinding2Component.builder().theAppModule(
            TheAppModule(applicationContext)
        ).build()
        applicationBindings2Component.inject(this)
    }

    companion object {
        lateinit var applicationSimpleComponent: ApplicationSimpleComponent
        lateinit var applicationSimpleSingletonComponent: ApplicationSimpleSingletonComponent
        lateinit var applicationDoubleSingletonComponent: ApplicationDoubleSingletonComponent
        lateinit var applicationProvideComponent: ApplicationProvideComponent
        lateinit var applicationInjectComponent: ApplicationInjectComponent
        lateinit var applicationIntoMapComponent: ApplicationIntoMapComponent
        lateinit var applicationNamedComponent: ApplicationNamedComponent
        lateinit var applicationSubComponentComponent: ApplicationSubComponentComponent
        lateinit var applicationSub2ComponentComponent: ApplicationSub2ComponentComponent
        lateinit var applicationBindingsComponent: AppBindingComponent
        lateinit var applicationBindings2Component: AppBinding2Component
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}