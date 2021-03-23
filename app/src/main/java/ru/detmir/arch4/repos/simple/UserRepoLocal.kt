package ru.detmir.arch4.repos.simple

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class UserRepoLocal @Inject constructor(
    dbUserRepo: DbUserRepo
) {

    init {
        L.d("ooo")
    }

    fun getUserLocal(id: Int): String {
        L.d("ooo id=$id")
        return "User $id"
    }
}