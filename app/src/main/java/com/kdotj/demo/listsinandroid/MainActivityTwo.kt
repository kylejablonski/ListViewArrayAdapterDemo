package com.kdotj.demo.listsinandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import java.util.*

class MainActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_two)

        val listView = findViewById<View>(R.id.list_view) as ListView
        listView.adapter = ContactArrayAdapter(ContactObject.getContactList(), this, R.layout.layout_contact)
    }
}