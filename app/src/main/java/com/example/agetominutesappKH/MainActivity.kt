package com.example.agetominutesappKH

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    val tvSelectedDate : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDatePicker : Button = findViewById(R.id.btnDatePicker)
        btnDatePicker.setOnClickListener{
            clickDatePicker()
        }
    }
    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this,
        DatePickerDialog.OnDateSetListener{
            view,year, month,dayOfMonth ->
        },year,month,day)
        Toast.makeText(this,
            "year was $year,month was ${month+1},day of month was $dayOfMonth", Toast.LENGTH_LONG).show()
    },
    year,
    month,
    day,
    ).show()
}