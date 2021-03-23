package ru.detmir.arch4.repos.subcomponent

import ru.detmir.arch4.utils.L

class MyActivityViewModel(val myContext: MyContext, val name: String) {
    init {
        L.d("ooo")
    }
    fun give() {
        L.d("ooo myContext =${myContext} name=${name}")
    }
}