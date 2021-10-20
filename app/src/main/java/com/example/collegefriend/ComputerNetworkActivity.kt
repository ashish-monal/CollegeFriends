package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ComputerNetworkActivity : AppCompatActivity() {


    lateinit var btnModule1: Button

    lateinit var btnModule2: Button

    lateinit var btnModule3: Button

    lateinit var btnModule4: Button

    lateinit var btnModule5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer_network)

        btnModule1=findViewById(R.id.button1)
        btnModule1.setOnClickListener {
            val intentModule1=Intent(this@ComputerNetworkActivity,CNM1Activity::class.java)
            startActivity(intentModule1)
        }
        btnModule2=findViewById(R.id.button4)
        btnModule2.setOnClickListener {
            val intentModule2=Intent(this@ComputerNetworkActivity,CNM2Activity::class.java)
            startActivity(intentModule2)
        }
        btnModule3=findViewById(R.id.button3)
        btnModule3.setOnClickListener {
            val intentModule3=Intent(this@ComputerNetworkActivity,CNM3Activity::class.java)
            startActivity(intentModule3)
        }
        btnModule4=findViewById(R.id.button2)
        btnModule4.setOnClickListener {
            val intentModule4=Intent(this@ComputerNetworkActivity,CNM4Activity::class.java)
            startActivity(intentModule4)
        }
        btnModule5=findViewById(R.id.button5)
        btnModule5.setOnClickListener {
            val intentModule5=Intent(this@ComputerNetworkActivity,CNM5Activity::class.java)
            startActivity(intentModule5)
        }
    }
}
