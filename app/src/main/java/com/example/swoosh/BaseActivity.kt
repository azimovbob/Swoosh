package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

    open class BaseActivity : AppCompatActivity() {

    val Tag = "LiveCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag,"${javaClass.simpleName} onCreate" )
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        Log.d(Tag,"${javaClass.simpleName} onStart" )
        super.onStart()
    }

    override fun onResume() {
        Log.d(Tag,"${javaClass.simpleName} onResume" )
        super.onResume()
    }

    override fun onRestart() {
        Log.d(Tag,"${javaClass.simpleName} onRestart" )
        super.onRestart()
    }
    override fun onStop() {
        Log.d(Tag,"${javaClass.simpleName} onStop" )
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag,"${javaClass.simpleName} onDestroy" )
        super.onDestroy()
    }
}
