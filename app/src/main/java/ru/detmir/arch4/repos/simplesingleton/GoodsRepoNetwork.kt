package ru.detmir.arch4.repos.simplesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class GoodsRepoNetwork @Inject constructor(
    goodsRepoOkHttp: GoodsRepoOkHttp
) {
    init {
        L.d("ooo")
    }

    fun getGoodsRepoNetwork(): String {
        L.d("ooo")
        return "y"
    }
}