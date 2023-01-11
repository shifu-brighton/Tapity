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
            val bundle = Bundle()
            bundle.putString("amount", one.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btn2.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", two.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btn3.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", three.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }

        btn4.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", four.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }

        btn5.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", five.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }

        btn6.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", six.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }

        btn7.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", seven.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }

        btn8.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString("amount", eight.toString())
            val intent = Intent(this,CounterActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)        }
    }
}