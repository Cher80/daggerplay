package ru.detmir.arch4.repos.doublesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CatRepoOkHttp @Inject constructor() {
    init {
        L.d("ooo")
    }

    fun getGoodsRepoOkHttp(): String {
        L.d("ooo")
        return "y"
    }
}