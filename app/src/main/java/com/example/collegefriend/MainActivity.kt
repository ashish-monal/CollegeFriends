package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var btnSemester1: Button
    lateinit var btnSemester2: Button
    lateinit var btnSemester3: Button
    lateinit var btnSemester4: Button
    lateinit var btnSemester5: Button
    lateinit var btnSemester6: Button
    lateinit var btnSemester7: Button
    lateinit var btnSemester8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSemester6= findViewById(R.id.button6)

        btnSemester6.setOnClickListener{
            val intentSemester6= Intent(this@MainActivity,SemesterSixActivity::class.java)
            startActivity(intentSemester6)
        }
    }
}
