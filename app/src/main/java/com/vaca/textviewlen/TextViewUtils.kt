package com.vaca.textviewlen

object TextViewUtils {
    fun changeText(s:String):String{
        val l=s.length
        if(l>4) {
            return s.substring(0, 4)+"...";
        }else{
            return s;
        }
    }
}