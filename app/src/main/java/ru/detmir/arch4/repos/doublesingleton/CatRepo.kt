package ru.detmir.arch4.repos.doublesingleton

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class CatRepo @Inject constructor(
    private val catRepoLocal: CatRepoLocal,
    private val catRepoNetwork: CatRepoNetwork
) {

    init {
        L.d("ooo")
    }

    fun give(id: Int): String {
        L.d("ooo id=$id")
        catRepoLocal.give()
        catRepoNetwork.give()
        return "User $id"
    }
}