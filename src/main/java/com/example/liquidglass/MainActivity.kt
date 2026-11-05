package com.example.liquidglass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "Liquid Glass UI Overlay Active"
            textSize = 22f
            setPadding(50, 50, 50, 50)
        }
        setContentView(textView)
    }
}
