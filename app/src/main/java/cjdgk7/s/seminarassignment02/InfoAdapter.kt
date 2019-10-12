package cjdgk7.s.seminarassignment02

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cjdgk7.s.seminarassignment02.data.InfoItem



class InfoAdapter (private val context: Context) : RecyclerView.Adapter<InfoViewHolder>(){

    var data = listOf<InfoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_infomation, parent, false)

        return InfoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.bind(data[position])
    }

}