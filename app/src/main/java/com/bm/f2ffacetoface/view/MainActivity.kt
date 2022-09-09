package com.bm.f2ffacetoface.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bm.f2ffacetoface.databinding.ActivityMainBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        auth = Firebase.auth

        val currentuser = auth.currentUser

        if (currentuser != null){
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
            finish()

            FirebaseApp.initializeApp(/*context=*/this)
            val firebaseAppCheck = FirebaseAppCheck.getInstance()
            firebaseAppCheck.installAppCheckProviderFactory(
                PlayIntegrityAppCheckProviderFactory.getInstance())
        }


    }



    fun signinbtnfunc (view: View ){

        val email = binding.emailtxt.text.toString()
        val password = binding.passwordtxt.text.toString()

        if (email.equals("") || password.equals("")) {

            Toast.makeText(this,"Enter email or password.",Toast.LENGTH_LONG).show()
        }
        else{
            auth.signInWithEmailAndPassword(email,password).addOnSuccessListener {

                //success
                val intent = Intent(this, FeedActivity::class.java)
                startActivity(intent)
                finish()

            }.addOnFailureListener {
                Toast.makeText(this,it.localizedMessage,Toast.LENGTH_LONG).show()

            }

        }



    }

    fun signupbtnfunc (view: View){

        val email = binding.emailtxt.text.toString()
        val password = binding.passwordtxt.text.toString()

        if (email.equals("") || password.equals("")) {

            Toast.makeText(this,"Enter email or password.",Toast.LENGTH_LONG).show()
        }
        else{
            auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {

                //success
                val intent = Intent(this, FeedActivity::class.java)
                startActivity(intent)
                finish()

            }.addOnFailureListener {
                Toast.makeText(this,it.localizedMessage,Toast.LENGTH_LONG).show()

            }

        }


    }

}