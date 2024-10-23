package com.chandravir.class10app.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chandravir.class10app.R

class SubjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_subject)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Button for Mathematics
        val mathButton: Button = findViewById(R.id.btnMath)
        mathButton.setOnClickListener {
            val intent = Intent(this, DownloadActivity::class.java)
            intent.putExtra("subject", "Mathematics")
            startActivity(intent)
        }

        // Button for Science
        val scienceButton: Button = findViewById(R.id.btnScience)
        scienceButton.setOnClickListener {
            val intent = Intent(this, DownloadActivity::class.java)
            intent.putExtra("subject", "Science")
            startActivity(intent)
        }

         //Button for English
        val englishButton: Button = findViewById(R.id.btnEnglish)
        englishButton.setOnClickListener {
            val intent = Intent(this, DownloadActivity::class.java)
            intent.putExtra("subject", "English")
            startActivity(intent)
        }
         //Button for Social Science
        val socialScienceButton: Button = findViewById(R.id.btnSocialScience)
        socialScienceButton.setOnClickListener {
            val intent = Intent(this, DownloadActivity::class.java)
            intent.putExtra("subject", "Social Science")
            startActivity(intent)
        }


    }
}