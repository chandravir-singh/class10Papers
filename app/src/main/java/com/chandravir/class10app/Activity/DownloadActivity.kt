package com.chandravir.class10app.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chandravir.class10app.R

class DownloadActivity : AppCompatActivity() {


    private val papers = mapOf(
        "Mathematics" to Pair(
            "https://drive.google.com/file/d/1KtLABIZQMVl3qariGR_WgYgohZMhE5n0/view?usp=sharing",
            "https://drive.google.com/file/d/1WAFkKs3TxmoJZH-YwaUpbp-UQlrSAakX/view?usp=sharing"
        ),
        "Science" to Pair(
            "https://drive.google.com/file/d/1pOcB4pn0-ewLNbjQR6e-iXI2hyw517zd/view?usp=sharing",
            "https://drive.google.com/file/d/10VMtEl5aoMyNSKUjLqaeabe8-eXC4xsJ/view?usp=sharing"
        ),
        "English" to Pair(
            "https://drive.google.com/file/d/1HyBPw3ACByk2xFoNHEymJ1YiEXgsdof3/view?usp=sharing",
            "https://drive.google.com/file/d/1bhWDuRCGRJbOHReK0mA2FI3hTEL3wat9/view?usp=sharing"
        ),
        "Social Science" to Pair(
            "https://drive.google.com/file/d/12-4Mze4tU1HzVljVIeKBj-aWQrGuE2Gp/view?usp=sharing",
            "https://drive.google.com/file/d/1mp1hF6HLeXLyFHyk4enL1txU4il8uMFi/view?usp=sharing"
        )

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_download)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Retrieve the subject passed from the previous activity
        val subject = intent.getStringExtra("subject")

        // Get the TextView and Buttons from the layout
        val subjectTextView: TextView = findViewById(R.id.subjectTextView)
        val paper1Button: Button = findViewById(R.id.paper1Button)
        val paper2Button: Button = findViewById(R.id.paper2Button)

        // Set the subject name in the TextView
        subjectTextView.text = subject

        // Check if the subject is present in the papers map
        if (papers.containsKey(subject)) {
            // Get the download links for Paper 1 and Paper 2
            val paperLinks = papers[subject]
            if (paperLinks != null) {
                val (paper1Link, paper2Link) = paperLinks

                // Set the click listeners for Paper 1 and Paper 2 buttons
                paper1Button.setOnClickListener {
                    downloadFile(paper1Link)
                }

                paper2Button.setOnClickListener {
                    downloadFile(paper2Link)
                }
            }
        } else {
            // Show a message if there are no papers available for the selected subject
            Toast.makeText(this, "No papers available for this subject.", Toast.LENGTH_SHORT).show()
        }
    }

    // Function to initiate the download of the file
    private fun downloadFile(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}