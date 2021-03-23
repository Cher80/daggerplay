package ru.detmir.arch4.repos.inject

import ru.detmir.arch4.utils.L
import javax.inject.Inject

class DepB @Inject constructor() {

    init {
        L.d("ooo")
    }
    
    fun give() {
        L.d("ooo")
    }

}