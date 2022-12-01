package com.example.tapity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        val database = Firebase.database
        val myRef = database.getReference("message1")
        var num = 0;
        val btn_confirm = findViewById<Button>(R.id.buttonConfirmCheckout)
        btn_confirm.setOnClickListener{
            num += 1
            myRef.setValue("Shifu the great one of all! $num")
        }
        // Write a message to the database



    }
}