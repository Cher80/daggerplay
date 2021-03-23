package ru.detmir.arch4.presentation.provide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R

class ProvideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.provide_activity)
        val root = App.applicationProvideComponent.giveMeRoot()
        root.getRoot()
    }
}