package com.example.tapity

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)


        var imageView = findViewById<ImageView>(R.id.quantity_image)
        var minusbtn = findViewById<Button>(R.id.quantity_decrement)
        var plusbtn = findViewById<Button>(R.id.quantity_increment)
        var textview = findViewById<TextView>(R.id.quantity_view)
        var totaltext = findViewById<TextView>(R.id.quantity_totaltxt)


        var quantity = 1
        var itemPrice = 0
        var constant_quantity = 1
        var constant_itemPrice = 0


        val fromHome = intent.extras?.getString("amount")
        val amount = fromHome?.toInt()


        when(amount){
            10 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                    textview.text = constant_quantity.toString()
                    totaltext.text = constant_itemPrice.toString()
                    imageView?.setImageResource(R.drawable.one_lit)}

            25 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.two_lit)}

            40 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.three_lit)}

            50 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.four_lit)}

            250 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.six_lit)}

            125 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.five_lit)}

            500 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.seven_lit)}

            75000 -> {constant_itemPrice = amount.toInt()
                itemPrice = constant_itemPrice
                textview.text = constant_quantity.toString()
                totaltext.text = constant_itemPrice.toString()
                imageView?.setImageResource(R.drawable.eight_lit)}
        }



        minusbtn.setOnClickListener(){
            if(quantity <= 1){
                Toast.makeText(this, "Can't decrease any further", Toast.LENGTH_SHORT).show()
            }else{
                quantity -= constant_quantity
                itemPrice -= constant_itemPrice
                textview.text = quantity.toString()
                totaltext.text = itemPrice.toString()
            }
        }

        plusbtn.setOnClickListener(){
            itemPrice += constant_itemPrice
            quantity += constant_quantity
            textview.text = quantity.toString()
            totaltext.text = itemPrice.toString()
        }


    }
}