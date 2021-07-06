package com.example.firstapp



import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    var gameState: String? = null
    val GAME_STATE_KEY = "game state key"
    val TEXT_VIEW_KEY = "text view key"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "onCreate")
        super.onCreate(savedInstanceState)
        gameState = savedInstanceState?.getString(GAME_STATE_KEY)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d("MainActivity", "onRestore")
        textView.text = savedInstanceState?.getString(TEXT_VIEW_KEY)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run {
            putString(GAME_STATE_KEY, gameState)
            putString(TEXT_VIEW_KEY, textView.text.toString())
        }
        Log.d("MainActivity", "onSave")
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "Destroy")
    }



    fun Onclick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}