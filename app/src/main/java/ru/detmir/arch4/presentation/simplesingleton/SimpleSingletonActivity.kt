package ru.detmir.arch4.presentation.simplesingleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.detmir.arch4.App
import ru.detmir.arch4.R

class SimpleSingletonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_singleton_activity)
        val goodsRepo = App.applicationSimpleSingletonComponent.giveMeGoodsRepo()
        goodsRepo.give(1)
        goodsRepo.give(2)
    }
}