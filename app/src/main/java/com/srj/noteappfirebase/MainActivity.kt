package com.srj.noteappfirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
    val db = Firebase.firestore
    val TAG = "MainACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Create a new user with a first and last name
        val user = hashMapOf(
            "name" to "SRJ ranjan",
            "email" to "Srjranjan99@gmail.com",
            "password" to "srjranjan123"
        )

// Add a new document with a generated ID
//        db.collection("users")
//            .document("Srjranjan")
//            .collection("UserDetails")
//            .add(user)
//            .addOnSuccessListener {
//                Log.d(TAG, "$it")
//
//            }
//            .addOnFailureListener {
//                Log.d(TAG, "${it.message}")
//            }
    }
}