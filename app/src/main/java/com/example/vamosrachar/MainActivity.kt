package com.example.vamosrachar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textbox = findViewById<EditText>(R.id.editText)
        button.setOnClickListener(View.OnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"${textbox.text}")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "App =)")
            startActivity(shareIntent)

        })


    }
}