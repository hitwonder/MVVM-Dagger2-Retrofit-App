package com.changesoftaction.mvvm_dagger2_retrofit_app.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.changesoftaction.mvvm_dagger2_retrofit_app.R
import com.changesoftaction.mvvm_dagger2_retrofit_app.model.Products

class ProductAdapter(private val products: List<Products>) :
    RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view)


    }


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.textView.text = products[position].title

        Glide.with(holder.imageView.context)
            .load(products[position].image)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return products.size
    }
}

class ProductViewHolder(item: View) : ViewHolder(item) {
    val textView: TextView = item.findViewById(R.id.tvName)
    val imageView: ImageView = item.findViewById(R.id.ivProduct)
}