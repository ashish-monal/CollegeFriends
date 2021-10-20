package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SemesterSixActivity : AppCompatActivity() {


    lateinit var btnMachineLearnig:Button
    lateinit var btnCompilerDesign:Button
    lateinit var btnComputerNetwork:Button
    lateinit var btnGraphTheory:Button
    lateinit var btnCryptography:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester_six2)


        btnMachineLearnig = findViewById(R.id.button11)

        btnMachineLearnig.setOnClickListener{
            val intentMachine= Intent(this@SemesterSixActivity,MachineLearningActivity::class.java)
            startActivity(intentMachine)
        }

        btnCompilerDesign= findViewById(R.id.button9)
        btnCompilerDesign.setOnClickListener {
            val intentCompilerDesign= Intent(this@SemesterSixActivity,CompilerDesignActivity::class.java)
            startActivity(intentCompilerDesign)
        }

        btnComputerNetwork = findViewById(R.id.button12)
        btnComputerNetwork.setOnClickListener {
            val intentComputerNetwork = Intent(this@SemesterSixActivity,ComputerNetworkActivity::class.java)
            startActivity(intentComputerNetwork)
        }



    }
}
