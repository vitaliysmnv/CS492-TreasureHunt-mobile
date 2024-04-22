/*
    Assignment 6
    Vitaliy Samonov / samonovv@oregonstate.edu
    CS 492 / Oregon State University
*/
package com.dicoding.picodiploma.treasurehunt_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.picodiploma.treasurehunt_kotlin.databinding.ActivityClueSuccessBinding

class ClueSuccessActivity:AppCompatActivity() {
    private lateinit var binding : ActivityClueSuccessBinding
    private lateinit var viewModel: GeofenceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClueSuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel.updateHint(geoindex)


        supportActionBar?.hide()
        var elapsedTime = intent.getLongExtra("elapsedTime", 0)
        val hours = elapsedTime / 3600
        val minutes = (elapsedTime % 3600) / 60
        val seconds = elapsedTime % 60
        val desc = intent.getStringExtra("description")
        binding.elasetime.text = String.format("%02d:%02d:%02d", hours, minutes, seconds)
        binding.dscTextView.text = desc

        binding.clueContinue.setOnClickListener {
            val intent = Intent(this, OnBoardActivity::class.java)
            startActivity(intent)
        }
    }
}