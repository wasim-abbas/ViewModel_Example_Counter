package com.example.viewmodelexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(val counter: Int) : ViewModelProvider.Factory {
    override fun <viewModel : ViewModel> create(modelClass: Class<viewModel>): viewModel {

        return MainViewModel(counter) as viewModel
    }
}