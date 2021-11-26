package com.example.imageshow

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView

public  class showimage  {
    companion object{
        fun imageshow(context: Context){
            var customLoginPopup = LayoutInflater.from(context).inflate(R.layout.activity_showimage,null)
            var customLoginPopupBuilder = AlertDialog.Builder(context).setView(customLoginPopup)
            customLoginPopupBuilder.show()
        }
    }
}