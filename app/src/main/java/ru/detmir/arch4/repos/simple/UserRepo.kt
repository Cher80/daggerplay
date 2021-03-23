package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class UserRepo @Inject constructor(
    private val userRepoLocal: UserRepoLocal,
    private val userRepoNetwork: UserRepoNetwork
) {

    init {
        L.d("ooo")
    }

    fun getUser(id: Int): String {
        L.d("ooo id=$id")
        userRepoLocal.getUserLocal(id)
        userRepoNetwork.getUserNetwork(id)
        return "User $id"
    }
}