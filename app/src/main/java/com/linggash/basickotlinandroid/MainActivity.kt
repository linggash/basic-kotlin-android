package com.linggash.basickotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // lateinit practice
    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponent(){
        nameEditText =findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponent()

        // get resource practice
        sayHelloTextView.text = resources.getString(R.string.app_name)

        // action listener practice
        sayHelloButton.setOnClickListener {

            //log practice
            Log.d("LSH", "This is debug log")
            Log.i("LSH", "This is info log")
            Log.w("LSH", "This is warn log")
            Log.e("LSH", "This is error log")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("LSH", it)
            }
        }
    }
}