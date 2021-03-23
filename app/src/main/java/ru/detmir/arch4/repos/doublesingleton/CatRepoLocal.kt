package ru.detmir.arch4.repos.doublesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CatRepoLocal @Inject constructor(
    catRepoOkHttp: CatRepoOkHttp
) {
    init {
        L.d("ooo")
    }

    fun give(): String {
        L.d("ooo")
        return "x"
    }
}