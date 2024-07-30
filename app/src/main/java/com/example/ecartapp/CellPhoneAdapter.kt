package com.example.ecartapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecartapp.databinding.CardviewBinding
import com.example.ecartapp.databinding.CellphoneItemBinding
import com.squareup.picasso.Picasso

class CellPhoneAdapter(val cellPhoneData: ArrayList<CellPhoneData>):  RecyclerView.Adapter<CellPhoneAdapter.MyViewHolder>(){
    lateinit var cardView: CardviewBinding
    var a = "$"
    class MyViewHolder(val cardviewBinding: CardviewBinding):RecyclerView.ViewHolder(cardviewBinding.root) {
        fun bindData(cellPhoneData: CellPhoneData){
            Picasso.get().load(cellPhoneData.assetPathCell).into(cardviewBinding.imginRecyclerView)
            cardviewBinding.tvProductName.text = cellPhoneData.mobileName
            cardviewBinding.tvPrice.text = "$ ${cellPhoneData.mobilePrice}"

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        cardView = CardviewBinding.inflate(layoutInflater,parent,false)
        return MyViewHolder(cardView)
    }

    override fun getItemCount(): Int {
        return cellPhoneData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(cellPhoneData[position])

    }
}