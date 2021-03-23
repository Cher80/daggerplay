package ru.detmir.arch4.presentation.binding2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.binding2.TheAppWideLogger
import javax.inject.Inject

class TheLoginActivity : AppCompatActivity() {

    @Inject
    lateinit var theAppWideLogger: TheAppWideLogger

    @Inject
    lateinit var theLoginViewModel: TheLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.binding2_activity)
        theAppWideLogger.give()
        theAppWideLogger.give()
        theLoginViewModel.give()
    }
}