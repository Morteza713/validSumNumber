package com.example.validsumnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNumbers = findViewById<EditText>(R.id.etNumbers)
        var etAdd = findViewById<EditText>(R.id.etAdd)
        var btnFind = findViewById<Button>(R.id.btnFind)
        var txtShowNum = findViewById<TextView>(R.id.txtShowNum)

        var list = etNumbers.toString()
        var num = etAdd.toString()

        btnFind.setOnClickListener {
            txtShowNum.text = sumList(list,num).toString()
        }

    }
    private fun sumList(list: String, num: String): Boolean {
        var flag: Boolean = false
        var num1 = num.toInt()
        var l = list.split(",")
        var intList = l.map {
            it.toInt()
        }

        for (i in 0 until intList.size - 1) {
            for (j in 0 until intList.size - 1) {
                var sum = intList[i] + intList[j]
                if (num1 == intList[j]) {
                    flag = true
                } else if (num1 == sum) {
                    flag = true
                }
            }
        }
        return flag

    }
}