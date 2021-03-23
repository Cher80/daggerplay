package ru.detmir.arch4.presentation.sub2component

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.sub2component.NdaActivityModule
import ru.detmir.arch4.repos.sub2component.NdaActivityViewModel
import javax.inject.Inject

class Sub2ComponentActivity : AppCompatActivity() {
//    @Inject
//    lateinit var ndaActivitySubcomponentBuilder: NdaActivitySubcomponent.Builder

        @Inject
    lateinit var ndaActivityViewModel: NdaActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub2component_activity)
        //App.applicationSub2ComponentComponent.inject(this)
        App.applicationSub2ComponentComponent.getNdaActivitySubcomponent().childModule(NdaActivityModule("mmm")).build().inject(this)
//        val ndaActivityViewModel = ndaActivitySubcomponentBuilder.childModule(NdaActivityModule("mmm")).build().giveNdaActivityViewModel()
        ndaActivityViewModel.give()
    }
}