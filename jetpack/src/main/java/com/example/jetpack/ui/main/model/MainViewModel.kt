package com.example.jetpack.ui.main.model

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    data class User(val firstName: String, val lastName: String)

    private val _user = MutableLiveData<User>()

    val user: LiveData<User> get() = _user

}