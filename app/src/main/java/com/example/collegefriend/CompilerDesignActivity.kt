package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class CompilerDesignActivity : AppCompatActivity() {

    lateinit var btnModule1: Button

    lateinit var btnModule2: Button

    lateinit var btnModule3: Button

    lateinit var btnModule4: Button

    lateinit var btnModule5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compiler_design)

        btnModule5=findViewById(R.id.button5)
        btnModule5.setOnClickListener {
            val intentModule5= Intent(this@CompilerDesignActivity,ModuleFiveCompilerDesignActivity::class.java)
            startActivity(intentModule5)
        }

        btnModule4 =findViewById(R.id.button2)
        btnModule4.setOnClickListener {
            val intentModule4= Intent(this@CompilerDesignActivity,Module4ComiplerDesign::class.java)
            startActivity(intentModule4)
        }

        btnModule3 = findViewById(R.id.button3)
        btnModule3.setOnClickListener {
            val intentModule3= Intent(this@CompilerDesignActivity,Module3CompilerDesignActivity::class.java)
            startActivity(intentModule3)
        }
        btnModule2 = findViewById(R.id.button4)
        btnModule2.setOnClickListener {
            val intentModule2= Intent(this@CompilerDesignActivity,Module2CompilerDesignActivity::class.java)
            startActivity(intentModule2)
        }

        btnModule1 = findViewById(R.id.button1)
        btnModule1.setOnClickListener {
            val intentModule1= Intent(this@CompilerDesignActivity,Module1CompilerDesignActivity::class.java)
            startActivity(intentModule1)
        }

    }

}
