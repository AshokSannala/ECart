package com.example.ecartapp.cartActivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecartapp.CellPhoneAdapter
import com.example.ecartapp.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {
    lateinit var cartBinding: ActivityCartBinding
    lateinit var cartCellPhoneList : ArrayList<CartData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cartBinding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(cartBinding.root)
        cartBinding.rvCartActivity.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
      // cartBinding.rvCartActivity.adapter = CartAdapter(setData())


    }

   /* private fun setData(): ArrayList<CartData> {


    }*/
}