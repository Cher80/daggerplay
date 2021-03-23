package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class DbUserRepo @Inject constructor(
    dbUserLoggerRepo: DbUserLoggerRepo,
    keyUserChainRepo: KeyChainUserRepo
) {

    init {
        L.d("ooo")
    }

    fun getDb(): String {
        L.d("ooo")
        return "Db"
    }
}