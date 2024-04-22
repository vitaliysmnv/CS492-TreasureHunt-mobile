/*
    Assignment 6
    Vitaliy Samonov / samonovv@oregonstate.edu
    CS 492 / Oregon State University
*/
package com.dicoding.picodiploma.treasurehunt_kotlin

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dicoding.picodiploma.treasurehunt_kotlin.databinding.ActivityOnBoardBinding

class OnBoardActivity : AppCompatActivity() {
    private lateinit var binding : ActivityOnBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.clueStart.setOnClickListener {
            val intent = Intent(this, HuntMainActivity::class.java)
            startActivity(intent)
        }
    }


}