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
        cellPhoneList.add(CellPhoneData(R.drawable.phn1, "SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn2,"MicroMax",60))
        cellPhoneList.add(CellPhoneData(R.drawable.phn3,"Iphone SE",80))
        cellPhoneList.add(CellPhoneData(R.drawable.phn4,"Iphone 14",900))
        cellPhoneList.add(CellPhoneData(R.drawable.phn5,"T Mobile",150))
        cellPhoneList.add(CellPhoneData(R.drawable.phn6,"Moto G",200))
        cellPhoneList.add(CellPhoneData(R.drawable.phn7,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn8,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn9,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn10,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn11,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn12,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn13,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn14,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn15,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn16,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn17,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn18,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn19,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn20,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn21,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn22,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn23,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn24,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn24,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn25,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn26,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn27,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn28,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn29,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn30,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn31,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn32,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn33,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn34,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn35,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn36,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn37,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn38,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn39,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn40,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn41,"SAMSUNG A10",100))
        cellPhoneList.add(CellPhoneData(R.drawable.phn42,"SAMSUNG A10",100))
        return cellPhoneList

    }
}