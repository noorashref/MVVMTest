package com.example.database.viewmodels

import android.text.Editable
import android.widget.TextView
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.database.databinding.ShowMessageFragmentBinding

class ShowMessageViewModel : ViewModel() {

    @Bindable
    val _inputText = MutableLiveData("")
    /*val inputText : LiveData<String>
    get() = _inputText*/

    private val _inputText2 = MutableLiveData("Text 2")
    val inputText2 : LiveData<String>
        get() = _inputText2

    private var _finalShow = MutableLiveData("")
    val finalShow : LiveData<String>
        get() = _finalShow

//    fun showMsg(txt :String){
//        _inputText.value = txt
//    }
    fun showMsg2(){
    _finalShow.value= _inputText.value + _inputText2.value
    }



}