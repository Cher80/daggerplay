package ru.detmir.arch4.repos.sub2component

import ru.detmir.arch4.utils.L

class NdaActivityViewModel(val zContext: ZContext, val name: String) {
    init {
        L.d("ooo")
    }
    fun give() {
        L.d("ooo zContext=${zContext} name=${name}")
    }
}