package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class DbUserLoggerRepo @Inject constructor() {

    init {
        L.d("ooo")
    }

    fun getDbLogger(): String {
        L.d("ooo")
        return "Db"
    }
}