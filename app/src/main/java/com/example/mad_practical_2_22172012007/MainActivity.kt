package com.example.mad_practical_2_22172012007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("OnCreate method is called")
    }

    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainconstraint)
        if (obj!=null)
        {
            Snackbar.make(obj,message,Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("OnStart method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("OnRestart method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("OnPause method is called")
    }
    override fun onStop() {
        super.onStop()
        showMessage("OnStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("OnDestroy method is called")
    }

}