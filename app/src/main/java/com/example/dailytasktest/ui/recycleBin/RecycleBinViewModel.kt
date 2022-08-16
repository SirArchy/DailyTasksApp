package com.example.dailytasktest.ui.recycleBin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecycleBinViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Recycle Bin"
    }
    val text: LiveData<String> = _text
}