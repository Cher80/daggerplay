package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class SmsDataImpl @Inject constructor(val base: Base) : SmsData {
    init {
        L.d("ooo")
    }

    override fun give(): String {
        L.d("ooo")
        return "s"
    }
}