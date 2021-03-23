package ru.detmir.arch4.presentation.named

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.named.Cat
import ru.detmir.arch4.utils.L
import javax.inject.Inject
import javax.inject.Named

class NamedActivity : AppCompatActivity() {

    @Inject
    @Named("AAA")
    lateinit var catA: Cat

    @Inject
    @Named("BBB")
    lateinit var catB: Cat


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.named_activity)
        App.applicationNamedComponent.inject(this)
        L.d("ooo ${catA.name} ${catB.name}")

    }
}