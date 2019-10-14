package com.example.studentportal

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_portal.view.*




class PortalAdapter(private val portals: List<Portal>) : RecyclerView.Adapter<PortalAdapter.ViewHolder>() {

    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_portal, parent, false)
        )
    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return portals.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(portals[position])
    }

    private fun onItemClick(portal: Portal) {
        println("$portal.title clicked!")
    }

    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        fun bind(portal: Portal) {
            itemView.portalLayout.setBackgroundColor(Color.WHITE)
            itemView.tvTitle.text = portal.title
            itemView.tvUrl.text = portal.url
        }

        init {
            itemView.setOnClickListener { onItemClick(portals[adapterPosition]) }
        }
    }
}