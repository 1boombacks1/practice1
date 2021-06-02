package ru.mirea.nikolaev.clickbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var btnOk: Button
    private lateinit var btnCncl: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvOut)
        btnOk = findViewById(R.id.btnOK)
        btnCncl = findViewById(R.id.btnCancel)

        btnOk.setOnClickListener { textView.setText("Нажата кнопка OK") }
        //btnCncl.setOnClickListener { textView.text = "Нажата кнопка Cancel" }
    }

    fun onMyButtonClick(view: View){
        Toast.makeText(this, "Еще один способ!",Toast.LENGTH_SHORT).show()
    }
}