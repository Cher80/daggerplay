package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class Base @Inject constructor() {

    fun getBaseData() {
        L.d("ooo")
    }
}