package ru.detmir.arch4.presentation.doublesingleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R

class DoubleSingletonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.double_singleton_activity)
        val catRepo = App.applicationDoubleSingletonComponent.giveMeCatRepo()
        catRepo.give(1)
        catRepo.give(2)
    }
}