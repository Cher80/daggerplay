package ru.detmir.arch4.presentation.intomap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R
import ru.detmir.arch4.repos.intomap.Loc
import ru.detmir.arch4.repos.intomap.LocA
import ru.detmir.arch4.utils.L
import javax.inject.Inject

class IntomapActivity : AppCompatActivity() {

    @Inject
    lateinit var map: Map<String, String>

    @Inject
    lateinit var mapLoc: @JvmSuppressWildcards Map<Class<out Loc>, @JvmSuppressWildcards Loc>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.provide_activity)
        App.applicationIntoMapComponent.inject(this)
        L.d("ooo ${map.get("A")}")
        val locAImpl: LocA = mapLoc.get(LocA::class.java) as LocA
        locAImpl.give()
    }
}