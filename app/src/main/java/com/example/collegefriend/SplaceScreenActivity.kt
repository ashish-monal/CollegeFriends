package com.example.collegefriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplaceScreenActivity : AppCompatActivity() {


    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace_screen)

      window.setFlags(
          WindowManager.LayoutParams.FLAG_FULLSCREEN,
          WindowManager.LayoutParams.FLAG_FULLSCREEN
      )

        handler = Handler()
        handler.postDelayed({
            val intent= Intent(this@SplaceScreenActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)


    }
}
