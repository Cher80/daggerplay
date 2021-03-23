package ru.detmir.arch4.presentation.inject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.inject.DepA
import ru.detmir.arch4.repos.inject.DepB
import javax.inject.Inject

class InjectActivity : AppCompatActivity() {

    @Inject
    lateinit var depA: DepA

    @Inject
    lateinit var depB: DepB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.provide_activity)
        App.applicationInjectComponent.doit(this)
        depA.give()
        depB.give()
    }
}