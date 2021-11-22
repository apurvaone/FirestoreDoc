package com.example.firestoredoc

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val db = Firebase.firestore

        val username="apurvaone"

        val user= hashMapOf(
            "first" to "Apoorv",
            "last" to "Shukla",
            "dob" to "24/01/2000"
        )

        val userRef= db.collection("users").document(username)

        userRef.set(user)

        userRef
            .set(user)
            .addOnSuccessListener {
                Log.d("udata added", "DocumentSnapshot added")

            }
            .addOnFailureListener {
                Log.w("udata addition failed","Error",it)
            }


        val meesageRef1= db
            .collection("rooms")
            .document("roomC")
            .collection("messages")
            .document("message1")

        val msg1= hashMapOf(
            "from" to "bhushan",
            "msg" to "ye wala form bhara kya yaar kisine"

        )

        meesageRef1.set(msg1)


//        val user= hashMapOf("first" to "Apurva",
//        "last" to "Shukla",
//        "dob" to "2001")
//
//        db.collection("users")
//            .add(user)
//            .addOnSuccessListener { documentReference->
//                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
//
//            }
//            .addOnFailureListener {
//                Log.w(TAG, "Error adding document", it)
//
//            }
//
//        // Create a new user with a first, middle, and last name
//        val user2 = hashMapOf(
//            "first" to "Alan",
//            "middle" to "Mathison",
//            "last" to "Turing",
//            "born" to 1912
//        )
//
//// Add a new document with a generated ID
//        db.collection("users")
//            .add(user2)
//            .addOnSuccessListener { documentReference ->
//                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
//            }
//            .addOnFailureListener { e ->
//                Log.w(TAG, "Error adding document", e)
//            }
//
//
//        db.collection("users")
//            .get()
//            .addOnSuccessListener { result->
//                for( document in result)
//                {
//                    Log.d("Getdata", "${document.id} => ${document.data}")
//
//                }
//            }
//            .addOnFailureListener{
//                Log.w(TAG,"Error getting documents")
//            }
            }

    }
