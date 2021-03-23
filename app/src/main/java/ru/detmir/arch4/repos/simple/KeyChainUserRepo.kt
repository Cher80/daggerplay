package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class KeyChainUserRepo @Inject constructor() {
    init {
        L.d("ooo")
    }

    fun getKeychain(): String {
        L.d("ooo")
        return "Db"
    }
}