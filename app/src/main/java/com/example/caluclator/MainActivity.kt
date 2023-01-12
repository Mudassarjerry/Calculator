package com.example.caluclator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity<a> : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         sum.setOnClickListener(){
             if(valitade()){
            var  num1 = number1.text.toString().toFloat()
             var  num2 = number2.text.toString().toFloat()
                var result = num1 + num2
                Toast.makeText(this, " The Sum is $result", Toast.LENGTH_SHORT).show()

            }
         }

        subtract.setOnClickListener() {
            if(valitade()){
                var num1 = number1.text.toString().toFloat()
                var num2 = number2.text.toString().toFloat()
                var result = num1 - num2
                Toast.makeText(this, " The Subtract is $result", Toast.LENGTH_SHORT).show()
            }
        }


        multiply.setOnClickListener() {
            if(valitade()){
                var num1 = number1.text.toString().toFloat()
                var num2 = number2.text.toString().toFloat()
                var result = num1 * num2
                Toast.makeText(this, "The Multiplication is $result", Toast.LENGTH_SHORT).show()
            }
        }


        divide.setOnClickListener(){
            if(valitade()){
            var  num1 = number1.text.toString().toFloat()

            var  num2 = number2.text.toString().toFloat()
            var result = num1/num2
            Toast.makeText(this, "The Divison is $result", Toast.LENGTH_SHORT).show()
        }}


        per.setOnClickListener(){

            if(valitade()){
                var  num1 = number1.text.toString().toFloat()
                var  num2 = number2.text.toString().toFloat()
                var result = (num1/num2)
                val per = result*100

                Toast.makeText(this, "The Percentage is $per", Toast.LENGTH_SHORT).show()
        }



    }
        clear.setOnClickListener(){
            number1.setText("")
            number2.setText("")
            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()



        }

    }


    private fun valitade(): Boolean {

        val num1 = number1.text.toString()
        val num2 = number2.text.toString()

        if(num1.isEmpty()){
            number1.error = " Required"
return false
        }

        if(num2.isEmpty()){
            number2.error = " Required"
return false
        }
else{


        return true
    }

    }
}














