package com.example.firestoredoc

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.Source
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView= findViewById(R.id.datagetter)


        val db = Firebase.firestore
        val str:String= ""
        val docref = db.collection("cities")
            .whereEqualTo("isCapital",true)
            .get()
            .addOnSuccessListener {
                for ( i in it)
                {
                    textView.text = textView.text.toString() + i.data
                }


            }
            .addOnCanceledListener {

            }


        /*The previous example retrieved the contents of the document as a map, but in some languages
        it's often more convenient to use a custom object type. In Add Data, you defined a City class that you used to define each city.
        You can turn your document back into a City object:*/

       /* val docref = db.collection("cities").document("KTN")

        docref.get().addOnSuccessListener {
            val city:City = it.toObject(City?)         // constructor error
            if (it != null) {
                {
                    textView.text= city.name
                }

            }
        }*/
    }






        //Get a document

     /*   val docref = db.collection("cities").document("KTN")
       val source= Source.CACHE //Source.Client , Source.Server and Source.Cache               //offline support

        docref.get(source)
            .addOnSuccessListener {
                if (it!= null)
                {
                        textView.text= (it.data).toString()

                }
                else
                {
                    textView.text= "Unable to fetch data"
                }
            }*/


       /* val city1= hashMapOf(
            "name" to "Jabalpur",
            "state" to "Madhya Pradesh",
            "country" to "India",
            "population" to 800000,
            "isCapital" to false,
            "regions" to listOf("madan mahal", "main market", "mg road")
        )

        val city2= hashMapOf(
            "name" to "Katni",
            "state" to "Madhya Pradesh",
            "country" to "India",
            "population" to "1000000",
            "isCapital" to false,
            "regions" to listOf("kala bazar", "gandhi chauraha")
        )

        db.collection("cities").document("JBP").set(city1)
        db.collection("cities").document("KTN").set(city2)

        val updates = hashMapOf<String,Any>("City added in " to FieldValue.serverTimestamp())
        db.collection("cities").document("JBP").update(updates)

        db.collection("cities").document("KTN").update(updates)
*/









       /* val docref= db.collection("rooms").document("roomA").collection("messages").document("message1")

        val updates= hashMapOf<String,Any>("msg"
        to FieldValue.delete())

        docref.update(updates).addOnSuccessListener {

        }
            .addOnFailureListener {
                Toast.makeText(this,"Deletion failed",Toast.LENGTH_LONG).show()
            }*/






        /*val docref= db.collection("cities").document("")


        val updates= hashMapOf<String,Any>(
            "isCapital" to FieldValue.delete()
        )

        docref.update(updates).addOnCompleteListener {

        }*/








    /*    db.collection("cities").document("BPL")   //deletes a document, wrong message in commit message
            .delete()
            .addOnSuccessListener {  }
            .addOnFailureListener {  }
*/



      /*  val docref= db.collection("cities").document("SDl")

        db.runTransaction {
            val snapshot = it.get(docref)
            val newPopulation= snapshot.getDouble("population")!! + 1

            if (newPopulation<1000000)
            {
                    it.update(docref,"population",newPopulation)

            }else
            {
                throw FirebaseFirestoreException("Population too high",FirebaseFirestoreException.Code.ABORTED)
            }

        }
            .addOnSuccessListener {
                Log.d(TAG,"Transaction Sucess : $it")

            }
            .addOnFailureListener {
                Log.w(TAG,"Transaction Failure ",it)

            }*/

     /*   val docref= db.collection("cities").document("SDl")            // Transaction example
       val updates= hashMapOf<String,Any>(
           "updated via transaction" to FieldValue.serverTimestamp()
       )
        db.runTransaction {
            val snapshot= it.get(docref)

            val new_population= snapshot.getDouble("population")!! + 1

            it.update(docref,"population",new_population)
            it.update(docref,updates)



            null
        }
            .addOnSuccessListener {

            }
            .addOnFailureListener {

            }*/




//
//       val city5= City("Shahdol","Madhya Pradesh","India",false,100000, listOf("aitajhar","jodhpur","padmania","shahdol"))
//        db.collection("cities").document("SDl").set(city5)

//        val docref= db.collection("cities").document("SDl")
//        val updates= hashMapOf<String,Any>(
//            "timestamp" to FieldValue.serverTimestamp())
//        docref.update("population",FieldValue.increment(1345))
//            .addOnSuccessListener {
//docref.update(updates).addOnCompleteListener {  }
//            }
//            .addOnFailureListener {
//
//            }












//        val washingtonRef = db.collection("cities").document("BPL")
//
//        washingtonRef.update("population",FieldValue.increment(199999))

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
