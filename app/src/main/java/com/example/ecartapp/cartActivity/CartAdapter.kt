package com.example.ecartapp.cartActivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecartapp.CellPhoneAdapter
import com.example.ecartapp.CellPhoneData
import com.example.ecartapp.databinding.CardviewBinding
import com.example.ecartapp.databinding.CartcardviewBinding
import com.example.ecartapp.databinding.CellphoneItemBinding
import com.squareup.picasso.Picasso

class CartAdapter (val cartCellPhoneData: ArrayList<CartData>): RecyclerView.Adapter<CartAdapter.MyViewHolder>(){
    lateinit var cartCardViewBinding: CartcardviewBinding


    class MyViewHolder ( val cartCardviewBinding: CartcardviewBinding): RecyclerView.ViewHolder(cartCardviewBinding.root){

        fun bindData( cartCellPhoneData:CartData ){
          Picasso.get().load(cartCellPhoneData.cartAssetPathCell).into(cartCardviewBinding.imginRecyclerView)
            cartCardviewBinding.tvProductName.text = cartCellPhoneData.cartMobileName
            cartCardviewBinding.tvPrice.text = "$ ${cartCellPhoneData.cartMobilePrice}"
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater =  LayoutInflater.from(parent.context)
        cartCardViewBinding = CartcardviewBinding.inflate(layoutInflater,parent,false)
        return MyViewHolder(cartCardViewBinding)
    }

    override fun getItemCount(): Int {
        return cartCellPhoneData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(cartCellPhoneData[position])
    }

}
/*
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
        }*/

