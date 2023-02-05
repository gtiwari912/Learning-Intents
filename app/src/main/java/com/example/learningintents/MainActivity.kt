package com.example.learningintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0;
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        addText(textView, "On Create")

    }

    override fun onResume() {
        super.onResume()
        addText(textView, " On Resume")
    }

    override fun onStart() {
        super.onStart()
        addText(textView, "On Start");
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        addText(textView, "On Pause")
    }

    override fun onStop() {
        super.onStop()
        addText(textView, "On Stop")
    }

    fun addText(tv: TextView, str: String){
        textView.text = textView.text.toString()+"\n"+counter+": "+str
        counter++
    }
}