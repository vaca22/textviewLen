package com.vaca.textviewlen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t:TextView=findViewById(R.id.fuck)
        t.text=TextViewUtils.changeText("asdfaa")
    }
}