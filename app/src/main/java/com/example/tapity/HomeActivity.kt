package com.example.tapity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    private val one: Int = 10
    private val two: Int  = 25
    private val three: Int  = 40
    private val four: Int  = 50
    private val five: Int  = 125
    private val six: Int  = 250
    private val seven: Int  = 500
    private val eight: Int  = 75000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn1 = findViewById<ImageButton>(R.id.imageButton1)
        val btn2 = findViewById<ImageButton>(R.id.imageButton2)
        val btn3 = findViewById<ImageButton>(R.id.imageButton3)
        val btn4 = findViewById<ImageButton>(R.id.imageButton4)
        val btn5 = findViewById<ImageButton>(R.id.imageButton5)
        val btn6 = findViewById<ImageButton>(R.id.imageButton6)
        val btn7 = findViewById<ImageButton>(R.id.imageButton7)
        val btn8 = findViewById<ImageButton>(R.id.imageButton8)


        btn1.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked $one", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,CheckoutActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked $two", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }

        btn5.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }

        btn6.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }

        btn7.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }

        btn8.setOnClickListener(){
            Toast.makeText(this@HomeActivity, "You clicked 1", Toast.LENGTH_SHORT).show()
        }
    }
}