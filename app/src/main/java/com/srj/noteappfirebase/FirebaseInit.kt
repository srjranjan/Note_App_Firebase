package com.srj.noteappfirebase

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

interface FirebaseInit {
    val db: FirebaseFirestore
        get() = Firebase.firestore
}