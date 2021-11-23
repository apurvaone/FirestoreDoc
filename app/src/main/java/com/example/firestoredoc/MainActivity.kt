package com.example.firestoredoc

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val db = Firebase.firestore

        val washingtonRef = db.collection("cities").document("BPL")

        washingtonRef.update("population",FieldValue.increment(199999))

/*
// Atomically add a new region to the "regions" array field.
        washingtonRef.update("regions", FieldValue.arrayUnion("greater_bhawarkuan"))

// Atomically remove a region from the "regions" array field.
        washingtonRef.update("regions", FieldValue.arrayRemove("MP nagar"))*/


       /* db.collection("users").document("apurvaone").update(
            mapOf("first" to "Sir Apurva",
            "last" to "Shukla Ji"
            )

        )

        val nameref= db.collection("users").document("apurvaone")

        val updates = hashMapOf<String, Any>(
            "timestamp" to FieldValue.serverTimestamp()
        )

        nameref.update(updates)*/



    /*    val city= City("Tokyo","Joku","Japan",true,
        500000, listOf("sdnsk","kzjxs"))

        db.collection("cities").add(city)


        val idrref= db.collection("cities").document("IDR")

        idrref.update("name","IndoraNagar")
            .addOnSuccessListener {

            }
            .addOnFailureListener {

            }

        val updates = hashMapOf<String, Any>(
            "timestamp" to FieldValue.serverTimestamp()
        )

        idrref.update(updates).addOnCompleteListener {  }*/



       /* val docData= hashMapOf(

                "stringEx" to "THis is A sTrInG",
            "booleanEx" to true,
            "numberEx" to 3.14232323,
            "dataEx" to arrayListOf(1,2,3),
            "nullEx" to null
        )

        val nestedData= hashMapOf(  //objectEx
            "a" to 5 ,
            "b" to true
        )

        docData["objectEx"]= nestedData

        db.collection("dataEx").document("one")
            .set(docData)
            .addOnSuccessListener {  }
            .addOnFailureListener {  }*/

//        val city= hashMapOf(
//            "name" to "Indore",
//        "state" to "MP",
//        "country" to "india"
//        )
//
//        db.collection("cities")
//            .document("IDR")
//            .set(city)
//            .addOnSuccessListener {
//                Log.d(TAG,"Doc wriiten")
//            }
//            .addOnFailureListener {
//                e->
//                Log.w(TAG,"Error",e)
//            }



       /* val username="apurvaone"

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

*/
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
