package com.example.morningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mAnswer: TextView
    lateinit var mFnumb: EditText
    lateinit var mSnumb: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mDiv: Button
    lateinit var mMult: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mtv_answer)
        mFnumb = findViewById(R.id.mEdt_Fnum)
        mSnumb = findViewById(R.id.mEdt_SeNum)
        mAdd = findViewById(R.id.mBtn_Add)
        mSub = findViewById(R.id.mbtn_sub)
        mDiv = findViewById(R.id.mbtn_div)
        mMult = findViewById(R.id.mbtn_Mul)
        // set onclick listeners to all the buttons
        mAdd.setOnClickListener {
// Receive the first and second numbers to compute
            var firstnumber = mFnumb.text.toString().trim()
            var secondnumber = mSnumb.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()) {
                mAnswer.text = "Please enter valid numbers"
            } else {
                // procede to compute the values
                var jibu = firstnumber.toDouble() + secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
// Receive the first and second numbers to compute
            var firstnumber = mFnumb.text.toString().trim()
            var secondnumber = mSnumb.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()) {
                mAnswer.text = "Please enter valid numbers"
            } else {
                // procede to compute the values
                var jibu = firstnumber.toDouble() - secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
// Receive the first and second numbers to compute
            var firstnumber = mFnumb.text.toString().trim()
            var secondnumber = mSnumb.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()) {
                mAnswer.text = "Please enter valid numbers"
            } else {
                // procede to compute the values
                var jibu = firstnumber.toDouble() / secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMult.setOnClickListener {
// Receive the first and second numbers to compute
            var firstnumber = mFnumb.text.toString().trim()
            var secondnumber = mSnumb.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()) {
                mAnswer.text = "Please enter valid numbers"
            } else {
                // procede to compute the values
                var jibu = firstnumber.toDouble() * secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
    }
}