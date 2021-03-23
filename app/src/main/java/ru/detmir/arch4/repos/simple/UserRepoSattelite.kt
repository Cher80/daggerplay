package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class UserRepoSattelite @Inject constructor() {
    init {
        L.d("ooo")
    }

    fun getUserSatellite(id: Int): String {
        L.d("ooo id=$id")
        return "User $id"
    }
}