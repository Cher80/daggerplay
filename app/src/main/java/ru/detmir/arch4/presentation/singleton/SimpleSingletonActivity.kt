package ru.detmir.arch4.presentation.singleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R

class SimpleSingletonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_singleton_activity)
        val userRepo = App.applicationSimpleSingletonComponent.giveMeGoodsRepo()
        userRepo.getUser(1)
        userRepo.getUser(2)
//        userRepo.getUser(2)
//        L.d("\n")
//        userRepo.getUser(3)
//        L.d("\n")
//        userRepo.getUser(4)
    }
}