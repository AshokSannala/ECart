package com.example.ecartapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecartapp.databinding.ActivityCellPhonesBinding
import com.example.ecartapp.databinding.CellphoneItemBinding

class CellPhonesActivity : AppCompatActivity() {
    lateinit var binding: ActivityCellPhonesBinding
    lateinit var cellPhoneList: ArrayList<CellPhoneData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCellPhonesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rv.adapter =  CellPhoneAdapter(setData())
        // Inflate the layout for this fragment

    }

    private fun setData(): ArrayList<CellPhoneData> {
        cellPhoneList = ArrayList<CellPhoneData>()
        cellPhoneList.add(CellPhoneData(R.drawable.phn1))
        cellPhoneList.add(CellPhoneData(R.drawable.phn2))
        cellPhoneList.add(CellPhoneData(R.drawable.phn3))
        cellPhoneList.add(CellPhoneData(R.drawable.phn4))
        cellPhoneList.add(CellPhoneData(R.drawable.phn5))
        cellPhoneList.add(CellPhoneData(R.drawable.phn6))
        cellPhoneList.add(CellPhoneData(R.drawable.phn7))
        cellPhoneList.add(CellPhoneData(R.drawable.phn8))
        cellPhoneList.add(CellPhoneData(R.drawable.phn9))
        cellPhoneList.add(CellPhoneData(R.drawable.phn10))
        cellPhoneList.add(CellPhoneData(R.drawable.phn11))
        cellPhoneList.add(CellPhoneData(R.drawable.phn12))
        cellPhoneList.add(CellPhoneData(R.drawable.phn13))
        cellPhoneList.add(CellPhoneData(R.drawable.phn14))
        cellPhoneList.add(CellPhoneData(R.drawable.phn15))
        cellPhoneList.add(CellPhoneData(R.drawable.phn16))
        cellPhoneList.add(CellPhoneData(R.drawable.phn17))
        cellPhoneList.add(CellPhoneData(R.drawable.phn18))
        cellPhoneList.add(CellPhoneData(R.drawable.phn19))
        cellPhoneList.add(CellPhoneData(R.drawable.phn20))
        cellPhoneList.add(CellPhoneData(R.drawable.phn21))
        cellPhoneList.add(CellPhoneData(R.drawable.phn22))
        cellPhoneList.add(CellPhoneData(R.drawable.phn23))
        cellPhoneList.add(CellPhoneData(R.drawable.phn24))
        cellPhoneList.add(CellPhoneData(R.drawable.phn24))
        cellPhoneList.add(CellPhoneData(R.drawable.phn25))
        cellPhoneList.add(CellPhoneData(R.drawable.phn26))
        cellPhoneList.add(CellPhoneData(R.drawable.phn27))
        cellPhoneList.add(CellPhoneData(R.drawable.phn28))
        cellPhoneList.add(CellPhoneData(R.drawable.phn29))
        cellPhoneList.add(CellPhoneData(R.drawable.phn30))
        cellPhoneList.add(CellPhoneData(R.drawable.phn31))
        cellPhoneList.add(CellPhoneData(R.drawable.phn32))
        cellPhoneList.add(CellPhoneData(R.drawable.phn33))
        cellPhoneList.add(CellPhoneData(R.drawable.phn34))
        cellPhoneList.add(CellPhoneData(R.drawable.phn35))
        cellPhoneList.add(CellPhoneData(R.drawable.phn36))
        cellPhoneList.add(CellPhoneData(R.drawable.phn37))
        cellPhoneList.add(CellPhoneData(R.drawable.phn38))
        cellPhoneList.add(CellPhoneData(R.drawable.phn39))
        cellPhoneList.add(CellPhoneData(R.drawable.phn40))
        cellPhoneList.add(CellPhoneData(R.drawable.phn41))
        cellPhoneList.add(CellPhoneData(R.drawable.phn42))
        return cellPhoneList

    }
}