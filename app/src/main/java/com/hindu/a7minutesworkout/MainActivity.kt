package com.hindu.a7minutesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.hindu.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private var binding:ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

         //val flStartButton : FrameLayout = findViewById(R.id.flstart)
        binding?.flstart?.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}