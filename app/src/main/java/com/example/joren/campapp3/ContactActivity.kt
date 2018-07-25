package com.example.joren.campapp3

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {

    var contactenLijst = Array(2){arrayOfNulls<String>(2)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        //array vullen met contacten
        contactenLijst [0][0] = "joren"
        contactenLijst [0][1] = "0499295935"
        contactenLijst [1][0] = "thuis"
        contactenLijst [1][1] = "011575701"

        val listView = findViewById<ListView>(R.id.lvContacts)

        listView.adapter = MyCustomAdapter(this)

    }

    private class MyCustomAdapter(context: Context) : BaseAdapter() {

        private val mContext: Context

        init{
            mContext = context
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "here is my row for my list"
            return textView
        }

        override fun getItem(position: Int): Any {
            return "test string"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return 50
        }

    }
}
