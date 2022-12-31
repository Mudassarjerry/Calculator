package com.example.caluclator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity<a> : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val number1 = findViewById<EditText>(R.id.number1)
         val number2 = findViewById<EditText>(R.id.number2)
         val sum = findViewById<Button>(R.id.sum)
         val subtract = findViewById<Button>(R.id.subtract)
         val multiply = findViewById<Button>(R.id.multiply)
         val divide = findViewById<Button>(R.id.divide)
        val clear = findViewById<Button>(R.id.clear)



         sum.setOnClickListener(){


             var  num1 = number1.text.toString().toFloat()
             var  num2 = number2.text.toString().toFloat()
             var result = num1+num2
             Toast.makeText(this, " The sum is $result", Toast.LENGTH_SHORT).show()



         }

        subtract.setOnClickListener(){

            var  num1 = number1.text.toString().toFloat()
            var  num2 = number2.text.toString().toFloat()
            var result = num1-num2
            Toast.makeText(this, " The subtract is $result", Toast.LENGTH_SHORT).show()
        }

        multiply.setOnClickListener(){
            var  num1 = number1.text.toString().toFloat()
            var  num2 = number2.text.toString().toFloat()
            var result = num1*num2
            Toast.makeText(this, "The multiplication is $result", Toast.LENGTH_SHORT).show()
        }

        divide.setOnClickListener(){
            var  num1 = number1.text.toString().toFloat()
            var  num2 = number2.text.toString().toFloat()
            var result = num1/num2
            Toast.makeText(this, "The Divison is $result", Toast.LENGTH_SHORT).show()
        }

        clear.setOnClickListener(){
            number1.setText("");
            number2.setText("");

            Toast.makeText(this,"Cleared",Toast.LENGTH_SHORT).show()
        }


    }}

   /* fun Calc(v: View){
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val result = findViewById<TextView>(R.id.result)

        val num1 = number1.text.toString()
        val num2 = number1.text.toString()
        val a : Float
        val b : Float
        val res : Float


        if(num1.isEmpty()){
            number1.error = "Required"
            return
        }
        else{
            a = number1.text.toString().toFloat()
        }

        if(num2.isEmpty()){
            number1.error = "Required"
            return
        }
        else{
            b = number1.text.toString().toFloat()
        }

        when(v.id){
            R.id.sum->{
                res = a+b
                result.text = result.toString()
            }
            R.id.subtract->{
                res = a-b
                result.text = result.toString()
            }
            R.id.multiply->{
                res = a*b
                result.text = result.toString()
            }
            /*R.id.divide->{
                if(num2==0.0F){
                    Toast.makeText(this, "dividebyzero", Toast.LENGTH_SHORT).show()
                }
                else{
                    res = number1/number2
                    result.text = result.toString()
                }

            }*/*/












