package ru.detmir.arch4.repos.simplesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class GoodsRepoLocal @Inject constructor(
    goodsRepoOkHttp: GoodsRepoOkHttp
) {
    init {
        L.d("ooo")
    }

    fun getGoodsRepoLocal(): String {
        L.d("ooo")
        return "x"
    }
}