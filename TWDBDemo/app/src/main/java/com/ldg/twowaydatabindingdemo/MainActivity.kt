package com.ldg.twowaydatabindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.databinding.InverseBindingListener
import androidx.lifecycle.MutableLiveData
import com.ldg.twowaydatabindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG: String="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainViewModel=MainViewModel()
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)?.let {
            it.viewmodel=mainViewModel
            it.lifecycleOwner=this
        }

        mainViewModel.checked.observe(this,{
            Log.d(TAG,it.toString())
        })


    }

}

class MainViewModel {


    val checked= MutableLiveData<Boolean>()

    val text= MutableLiveData<String>()

    val textNumber= MutableLiveData<Int>()

    fun changeNumber(itemId: Int) {
        textNumber.postValue(itemId)
    }


}