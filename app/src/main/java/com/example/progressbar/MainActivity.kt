package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private lateinit var firstProgressBar:ProgressBar
    private lateinit var secondProgressBar:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstProgressBar = findViewById(R.id.firstProgress)
        secondProgressBar = findViewById(R.id.secondProgress)

        changeProgress()
    }

    private fun changeProgress(){
        Thread(Runnable {
            while(true){
                Thread.sleep(2000)
                val pro = (Math.random()*100).toInt()
                secondProgressBar.setProgress(pro)
            }


        }).start()
    }


}
