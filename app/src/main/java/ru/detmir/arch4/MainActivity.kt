package ru.detmir.arch4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.presentation.binding.LoginActivity
import ru.detmir.arch4.presentation.binding2.TheLoginActivity
import ru.detmir.arch4.presentation.doublesingleton.DoubleSingletonActivity
import ru.detmir.arch4.presentation.inject.InjectActivity
import ru.detmir.arch4.presentation.intomap.IntomapActivity
import ru.detmir.arch4.presentation.named.NamedActivity
import ru.detmir.arch4.presentation.provide.ProvideActivity
import ru.detmir.arch4.presentation.simple.SimpleActivity
import ru.detmir.arch4.presentation.simplesingleton.SimpleSingletonActivity
import ru.detmir.arch4.presentation.sub2component.Sub2ComponentActivity
import ru.detmir.arch4.presentation.subcomponent.SubComponentActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt1Simple = findViewById<Button>(R.id.butt1)
        val butt2SimpleSingleton = findViewById<Button>(R.id.butt2)
        val butt3DoubleSingleton = findViewById<Button>(R.id.butt3)
        val butt4Provide = findViewById<Button>(R.id.butt4)
        val butt5Inject = findViewById<Button>(R.id.butt5)
        val butt6Intomap = findViewById<Button>(R.id.butt6)
        val butt7Named = findViewById<Button>(R.id.butt7)
        val butt8Subcomponent = findViewById<Button>(R.id.butt8)
        val butt9Sub2component = findViewById<Button>(R.id.butt9)
        val butt10Bindingscomponent = findViewById<Button>(R.id.butt10)
        val butt11Bindings2component = findViewById<Button>(R.id.butt11)

        butt1Simple.setOnClickListener {
            startActivity(Intent(this, SimpleActivity::class.java))
        }

        butt2SimpleSingleton.setOnClickListener {
            startActivity(Intent(this, SimpleSingletonActivity::class.java))
        }

        butt3DoubleSingleton.setOnClickListener {
            startActivity(Intent(this, DoubleSingletonActivity::class.java))
        }
        butt4Provide.setOnClickListener {
            startActivity(Intent(this, ProvideActivity::class.java))
        }

        butt5Inject.setOnClickListener {
            startActivity(Intent(this, InjectActivity::class.java))
        }

        butt6Intomap.setOnClickListener {
            startActivity(Intent(this, IntomapActivity::class.java))
        }

        butt7Named.setOnClickListener {
            startActivity(Intent(this, NamedActivity::class.java))
        }

        butt8Subcomponent.setOnClickListener {
            startActivity(Intent(this, SubComponentActivity::class.java))
        }

        butt9Sub2component.setOnClickListener {
            startActivity(Intent(this, Sub2ComponentActivity::class.java))
        }

        butt10Bindingscomponent.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        butt11Bindings2component.setOnClickListener {
            startActivity(Intent(this, TheLoginActivity::class.java))
        }
    }
}