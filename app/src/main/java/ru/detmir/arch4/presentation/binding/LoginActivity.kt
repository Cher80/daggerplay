package ru.detmir.arch4.presentation.binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.binding.AppWideLogger
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var appWideLogger: AppWideLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.binding_activity)
        appWideLogger.give()
        appWideLogger.give()
    }
}