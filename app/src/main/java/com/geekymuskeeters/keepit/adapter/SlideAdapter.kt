package com.geekymuskeeters.keepit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geekymuskeeters.keepit.R
import com.geekymuskeeters.keepit.entities.SlideModel
import kotlinx.android.synthetic.main.item_slide.view.*

class SlideAdapter(
    private var slides : List<SlideModel>

) : RecyclerView.Adapter<SlideAdapter.SlideAdapterViewHolder>(){



    inner class SlideAdapterViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_slide,parent,false)
        return SlideAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return slides.size
    }

    override fun onBindViewHolder(holder: SlideAdapterViewHolder, position: Int) {

        holder.itemView.apply {
            val current = slides[position]
            tvSlideTitle.text = current.slidetitle
            tvSlideDesc.text = current.slidedesc
            imgSlide.setImageResource(current.slideimage)

        }

    }
}