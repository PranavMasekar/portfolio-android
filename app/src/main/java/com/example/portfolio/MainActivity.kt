package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skillButton = findViewById<Button>(R.id.skillBtn)

        skillButton.setOnClickListener {
            intent = Intent(this,SkillActivity::class.java)
            startActivity(intent)
        }

        val workButton = findViewById<Button>(R.id.workBtn)

        workButton.setOnClickListener{
            intent = Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        val educationButton = findViewById<Button>(R.id.educationBtn)

        educationButton.setOnClickListener{
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        val achievmentButton = findViewById<Button>(R.id.achievementBtn)

        achievmentButton.setOnClickListener{
            intent = Intent(this,AchievmentsActivity::class.java)
            startActivity(intent)
        }
    }
}