package com.example.ecartapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecartapp.databinding.CellphoneItemBinding
import com.squareup.picasso.Picasso

class CellPhoneAdapter(val cellPhoneData: ArrayList<CellPhoneData>):  RecyclerView.Adapter<CellPhoneAdapter.MyViewHolder>(){
    lateinit var cellPhone: CellphoneItemBinding
    class MyViewHolder(val cellPhoneItemBinding: CellphoneItemBinding):RecyclerView.ViewHolder(cellPhoneItemBinding.root) {
        fun bindData(cellPhoneData: CellPhoneData){
            Picasso.get().load(cellPhoneData.assetPathCell).into(cellPhoneItemBinding.imgCellPhone)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        cellPhone = CellphoneItemBinding.inflate(layoutInflater,parent,false)
        return MyViewHolder(cellPhone)
    }

    override fun getItemCount(): Int {
        return cellPhoneData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(cellPhoneData[position])

    }
}