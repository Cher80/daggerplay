package ru.detmir.arch4.presentation.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_activity)
        val userRepo = App.applicationSimpleComponent.giveMeUserRepo()
        userRepo.getUser(1)
    }
}