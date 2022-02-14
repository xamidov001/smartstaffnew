package uz.pdp.smartstaffnew.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.pdp.smartstaffnew.models.Result

class ResultViewModel(var width:Int, var height:Int):ViewModel() {


    private val widthMy = MutableLiveData<Result>().apply {
        value = Result(width,height)
    }

}