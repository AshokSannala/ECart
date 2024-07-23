package com.example.ecartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecartapp.databinding.ActivityDashBoardBinding

class DashBoardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgCellPhones.setOnClickListener{
            val intent = Intent(this, CellPhonesActivity::class.java)
            startActivity(intent)

        }

    }
}