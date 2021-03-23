package ru.detmir.arch4.repos.binding

import android.content.Context
import ru.detmir.arch4.utils.L
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppWideLogger @Inject constructor(
    context: Context
) {
    init {
        L.d("ooo")
    }

    fun give(): String {
        L.d("ooo")
        return "x"
    }
}