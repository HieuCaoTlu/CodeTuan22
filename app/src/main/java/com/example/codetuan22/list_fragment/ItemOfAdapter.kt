package com.example.codetuan22.list_fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.codetuan22.R

class ItemOfAdapter(context: Context, ls: ArrayList<ItemOfList>): BaseAdapter() {
    var ls: ArrayList<ItemOfList> = ls
    var context: Context = context

    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        var vax: ViewAX

        if (c == null)
        {
            vax = ViewAX()
            c = LayoutInflater.from(context).inflate(R.layout.item_list, null)
            vax.image_ax = c.findViewById(R.id.ItemImage)
            vax.title_ax = c.findViewById(R.id.ItemTitle)
            vax.description_ax = c.findViewById(R.id.ItemDescription)
            c.tag = vax
        }
        else {
            vax = c.tag as ViewAX
        }

        vax.image_ax!!.setImageResource(ls[position].image!!)
        vax.title_ax!!.text = ls[position].title!!
        vax.description_ax!!.text = ls[position].description!!
        return c!!
    }

    // Ánh xạ cho ItemView
    inner class ViewAX {
        var image_ax: ImageView? = null
        var title_ax: TextView? = null
        var description_ax: TextView? = null
    }
}

