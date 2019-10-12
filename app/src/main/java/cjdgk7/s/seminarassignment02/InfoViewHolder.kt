package cjdgk7.s.seminarassignment02

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cjdgk7.s.seminarassignment02.data.InfoItem


class InfoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val ctnRvItem: View = view.findViewById(R.id.ctn_rv_item)
    val txtUserId: TextView = view.findViewById(R.id.txt_user_id)
    val txtUserName: TextView = view.findViewById(R.id.txt_user_name)
    val imgUserProfile: ImageView = view.findViewById(R.id.img_user_profile)


    fun bind(data: InfoItem){
        txtUserId.text = data.id
        txtUserName.text = data.name
        //imgUserProfile. = data.profile
    }
}