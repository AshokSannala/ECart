package com.example.ecartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecartapp.databinding.ActivityLoginBinding
import com.example.ecartapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnregister.setOnClickListener {
            validations()


        }
        binding.tvAlreadyAccount.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }

    fun validations() {
        if (binding.etUname.text.toString().isEmpty()) {
            Toast.makeText(this, "Enter User Name", Toast.LENGTH_SHORT).show()
            return


        } else if (binding.etPassword.text.toString().isEmpty()) {
            Toast.makeText(this, "Enter User Password", Toast.LENGTH_SHORT).show()
            return

        } else if (binding.etPassword.text.toString().equals(binding.etConfPwd.text.toString())) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "passwords not matching", Toast.LENGTH_SHORT).show()
            return
        }
    }
}
