package com.example.ecartapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecartapp.database.DataBaseHelper
import com.example.ecartapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var database: DataBaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = DataBaseHelper(this)

        binding.btnLogin.setOnClickListener {
            val user =  database.checkCredentials(binding.etUnameLogin.text.toString(),binding.etPwdLogin.text.toString())
            if (user){
                val intent = Intent(this, DashBoardActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Log.i("zzz","Incorrect Credentials")
                Toast.makeText(this,"incorrect username or password",Toast.LENGTH_SHORT).show()
            }



        }
    }

}