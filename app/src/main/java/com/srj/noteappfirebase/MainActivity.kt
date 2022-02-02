package com.srj.noteappfirebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), FirebaseInit {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = hashMapOf(
            "first" to "Alan",
            "middle" to "Mathison",
            "last" to "Turing",
            "born" to 1912
        )

        db.collection("users")
            .add(user)
            .addOnSuccessListener {
                Toast.makeText(
                    this@MainActivity, "User added successfully", Toast.LENGTH_SHORT
                ).show()
            }
            .addOnFailureListener {
                Toast.makeText(this@MainActivity, "User creation failed", Toast.LENGTH_SHORT)
                    .show()

            }
    }
}