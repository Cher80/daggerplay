package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class PosDataImpl @Inject constructor(val base: Base) : PosData {
    init {
        L.d("ooo")
    }

    override fun getPosData(): String {
        L.d("ooo")
        return "s"
    }
}