package ru.detmir.arch4.repos.simplesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class GoodsRepo @Inject constructor(
    private val goodsRepoLocal: GoodsRepoLocal,
    private val goodsRepoNetwork: GoodsRepoNetwork
) {

    init {
        L.d("ooo")
    }

    fun give(id: Int): String {
        L.d("ooo id=$id")
        goodsRepoLocal.getGoodsRepoLocal()
        goodsRepoNetwork.getGoodsRepoNetwork()
        return "User $id"
    }
}