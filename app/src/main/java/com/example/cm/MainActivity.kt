package com.example.cm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition(view: View) {
        try {
            result(Text_x.text.toString().toFloat() + Text_y.text.toString().toFloat())
        } catch (e: Exception) {
            Toast.makeText(this, "Ошибка ввода: " + e.message, Toast.LENGTH_SHORT).show()
        }
    }

    fun subtraction(view: View) {
        try {
            result(Text_x.text.toString().toFloat() - Text_y.text.toString().toFloat())
        } catch (e: Exception) {
            Toast.makeText(this, "Ошибка ввода: " + e.message, Toast.LENGTH_SHORT).show()
        }
    }

    private fun result(answer: Float) {
        val second = Intent(this, SecondActivity::class.java)
        second.putExtra(SecondActivity.TOTAL_COUNT, answer)
        startActivity(second)
    }
}
