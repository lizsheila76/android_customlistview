package com.liz.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView=findViewById<ListView>(R.id.customlistview)
        val mylist= mutableListOf<model>()

        //img,title and description
        mylist.add(model("suv1","This is my first suv",R.drawable.suv1))
        mylist.add(model("suv2","This is my second suv",R.drawable.suv2))
        mylist.add(model("suv3","This is my third suv",R.drawable.suv3))
        mylist.add(model("suv4","This is my forth suv",R.drawable.suv4))
        mylist.add(model("tx1","This is my first tx",R.drawable.tx1))

        listView.adapter=myadapter(this,R.layout.row,mylist)



