package com.ldg.twowaydatabindingdemo

import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener

@BindingAdapter("sizeChange")
fun setSizeChange(view: EditText, newValue: Int?) {
    newValue?:return
    if (view.text.length != newValue) {
        //무한 루프 방지
    }
}



@InverseBindingAdapter(attribute = "sizeChange",event = "stringNumberAttrChanged")
 fun getSizeChange(view: EditText) : Int {
    view.setColorWithText(view.text.length)
    return view.text.length
}


@BindingAdapter("stringNumberAttrChanged")
fun setStringNumberAttrChangedInverseBindingListener(view: EditText, listener: InverseBindingListener?) {
    val watcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {

        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int){}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            listener?.onChange()
        }
    }
    view.addTextChangedListener(watcher)
}

private fun EditText.setColorWithText(newValue: Int) {
       when(newValue){
           1-> setTextColor(Color.RED)
           2-> setTextColor(Color.BLUE)
           3-> setTextColor(Color.GREEN)
           else-> setTextColor(Color.YELLOW)
       }
}