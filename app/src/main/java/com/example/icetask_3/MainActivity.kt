package com.example.icetask_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity<text> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText : TextView = findViewById(R.id.numberText)
        val instucText : TextView = findViewById(R.id.instucText)
        val enterButton : Button = findViewById(R.id.enterButton)
        val inputText : TextView = findViewById(R.id.inputText)


        enterButton.setOnClickListener{
            val inputnumber = inputText.text.toString().toIntOrNull()
            if(inputnumber != null) {
                val stringBuilder = StringBuilder()
                stringBuilder.append("Multiplication table for $inputnumber:\n")
                for(i in 1..10)
                    stringBuilder.append("$inputnumber * $i = ${inputnumber * i}\n")
                numberText.text = stringBuilder.toString()
            }
        }


    }
}