package ru.detmir.arch4.presentation.subcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.subcomponent.BilActivityModule
import ru.detmir.arch4.repos.subcomponent.MyActivityModule
import ru.detmir.arch4.repos.subcomponent.MyActivityViewModel
import javax.inject.Inject

class SubComponentActivity : AppCompatActivity() {

    @Inject
    lateinit var myActivityViewModel: MyActivityViewModel

//    @Inject
//    lateinit var bilActivityViewModel: BilActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subcomponent_activity)
        App.applicationSubComponentComponent.getMyActivitySubComponent(MyActivityModule("mia"))
            .inject(this)
        val bilActivityViewModel =
            App.applicationSubComponentComponent.getBilActivitySubComponentBuilder().childModule(
                BilActivityModule("vasya")
            ).build().giveBilActivityViewModel()

        myActivityViewModel.give()
        bilActivityViewModel.give()

        //L.d("ooo ${catA.name} ${catB.name}")

    }
}