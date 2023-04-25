package com.liz.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myadapter(var mCntx:Context,var resources:Int,var items:List<model>) :ArrayAdapter<model>(mCtx,resources,items) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater= LayoutInflater.from(mCntx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView= view.findViewById(R.id.imageView)
        val titleTextView:TextView=view.findViewById(R.id.textView)
        val descriptionTextView:TextView=view.findViewById(R.id.textview1)

        var mItem:model=items[position]
        imageView.setImageDrawable(mCntx.resources.getDrawable(mItem.img))
        titleTextView.text=mItem.title
        descriptionTextView.text =mItem.description





        return view
    }

}
