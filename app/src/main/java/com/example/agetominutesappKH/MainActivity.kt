package com.example.agetominutesappKH

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? = null
    private var tvAgeInMinutes : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDatePicker : Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)
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
        val SelectedDayOfMonth = ""
        val SelectedMonth
        val SelectedYear
        val selectedDate = "$SelectedDayOfMonth/${SelectedMonth+1}/$SelectedYear "
        tvSelectedDate?.text = selectedDate

        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

        val theDate = sdf.parse(selectedDate)

        val selectedDateInMinutes = theDate.time/60000

        val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

        val currentDateInMinutes = currentDate.time/60000

        val differenceInMinutes = currentDate - selectedDateInMinutes
    },
    year,
    month,
    day,
    ).show()
}