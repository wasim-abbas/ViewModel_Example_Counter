package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var btnCunter: Button
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this will keep eyes activity life cycle
        // if lie cycle destroy the view view model will also destroy
        // constantly it looks at life cycle
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(5)).get(MainViewModel::class.java)
        tv = findViewById(R.id.tvCounter)
        btnCunter = findViewById(R.id.btnCounter)
        setText()

        btnCunter.setOnClickListener {

            mainViewModel.incremrnt()
            setText()
        }

    }
    fun setText()
    {
        tv.text = mainViewModel.counter.toString()

    }
}