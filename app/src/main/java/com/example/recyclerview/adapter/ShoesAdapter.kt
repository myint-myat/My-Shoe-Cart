package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Shoes

class FruitsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var shoeName = itemView.findViewById<TextView>(R.id.shoe_name)
    var shoeImage= itemView.findViewById<ImageView>(R.id.shoe_image)
    var shoeBrand=itemView.findViewById<TextView>(R.id.shoe_brand)
    var shoePrice=itemView.findViewById<TextView>(R.id.shoe_price)

}

class ShoesAdapter(val shoesList: ArrayList<Shoes>) : RecyclerView.Adapter<FruitsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_item, parent, false)
        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoesList.size
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.shoeName.text = shoesList[position].name
        holder.shoeImage.setImageResource(shoesList[position].image)
        holder.shoeBrand.text=shoesList[position].brand
        holder.shoePrice.text=shoesList[position].price
    }

}