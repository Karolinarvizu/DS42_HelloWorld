package com.example.helloworld


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.helloworld.R.id.editTextText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(editTextText)

        button.setOnClickListener {
            val editText = editText.text.toString()
            Toast.makeText(this,"Hola! $editText",Toast.LENGTH_SHORT).show()

        }
    }
}
