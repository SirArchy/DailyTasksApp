package com.example.dailytasktest.ui.helpFeedback

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HelpFeedbackViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Help & Feedback"
    }
    val text: LiveData<String> = _text
}