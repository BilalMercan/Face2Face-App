package com.bm.f2ffacetoface.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bm.f2ffacetoface.databinding.RecyclerRowBinding
import com.bm.f2ffacetoface.model.Posts
import com.squareup.picasso.Picasso

class FeedAdapter(private val postList: ArrayList<Posts>) : RecyclerView.Adapter<FeedAdapter.Rvholder>() {

    class Rvholder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rvholder {
                val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return Rvholder(binding)
    }

    override fun onBindViewHolder(holder: Rvholder, position: Int) {

        holder.binding.rvemailtxt.text = postList[position].email
        holder.binding.rcyclercommenttxtview.text = postList[position].comment
        Picasso.get().load(postList.get(position).downlosdUrl).into(holder.binding.recyclerimageview)



    }

    override fun getItemCount(): Int {
         return postList.size
    }


}