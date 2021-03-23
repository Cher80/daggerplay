package ru.detmir.arch4.repos.doublesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class CatRepoNetwork @Inject constructor(
    catRepoOkHttp: CatRepoOkHttp
) {
    init {
        L.d("ooo")
    }

    fun give(): String {
        L.d("ooo")
        return "y"
    }
}