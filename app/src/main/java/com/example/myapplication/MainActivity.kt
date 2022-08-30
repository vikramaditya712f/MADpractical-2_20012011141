package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.StructMsghdr
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
      val TAG = "MainActivity"

    private fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this, msg,Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),msg,Snackbar.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate function called")
    }

    override fun onStart() {
        showMessage("onStart function called")
        super.onStart()
    }

    override fun onPause() {
        showMessage("onPause function called")
        super.onPause()
    }

    override fun onResume() {
        showMessage("onResume function called")
        super.onResume()
    }

    override fun onRestart() {
        showMessage("onRestart function called")
        super.onRestart()
    }

    override fun onStop() {
        showMessage("onStop function called")
        super.onStop()
    }

    override fun onDestroy() {
        showMessage("onDestroy function called")
        super.onDestroy()
    }
}