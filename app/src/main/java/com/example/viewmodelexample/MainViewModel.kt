package com.example.viewmodelexample

import androidx.lifecycle.ViewModel

class MainViewModel(val value:Int) : ViewModel() {
    var counter: Int = value

    fun incremrnt() {
        counter++
    }

}
