package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MachineLearningActivity : AppCompatActivity() {

    lateinit var btnIntroduction: Button
    lateinit var btnStatistivcal: Button
    lateinit var btnLinear: Button
    lateinit var btnHypothsis: Button
    lateinit var btnExpectation: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)


        btnIntroduction= findViewById(R.id.button10)

        btnIntroduction.setOnClickListener {
            val intentIntroduction= Intent(this@MachineLearningActivity,IntroductionActivity::class.java)
            startActivity(intentIntroduction)

        }

        btnStatistivcal = findViewById(R.id.button15)
        btnStatistivcal.setOnClickListener {
            val intentStatical = Intent(this@MachineLearningActivity,StatisticalDecisionActivity::class.java)
            startActivity(intentStatical)
        }

        btnLinear=findViewById(R.id.button16)
        btnLinear.setOnClickListener {
            val intentLinear= Intent(this@MachineLearningActivity,LinearActivity::class.java)
            startActivity(intentLinear)
        }

        btnHypothsis=findViewById(R.id.button17)
        btnHypothsis.setOnClickListener {
            val intentHypothesis = Intent(this@MachineLearningActivity,Hypothesis::class.java)
            startActivity(intentHypothesis)
        }

        btnExpectation = findViewById(R.id.button18)
        btnExpectation.setOnClickListener {
            val intentExcepectation= Intent(this@MachineLearningActivity,ExpectationActivity::class.java)
            startActivity(intentExcepectation)
        }

    }
}
