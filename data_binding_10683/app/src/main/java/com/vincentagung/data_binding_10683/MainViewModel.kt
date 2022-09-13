package com.vincentagung.data_binding_10683

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()

    val editTextContent = MutableLiveData<String>()

    private val _diplayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent: LiveData<String>
        get() = _diplayedEditTextContent

    fun onDisplayEditTextContentClick(){
        _diplayedEditTextContent.value = editTextContent.value
    }

    fun onSelectRandomEditTextFruit(){
        editTextContent.value = FakeRepository.getRandomfruitName()
    }
}