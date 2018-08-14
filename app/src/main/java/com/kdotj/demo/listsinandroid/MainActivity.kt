package com.kdotj.demo.listsinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<View>(R.id.list_view) as ListView
        listView.adapter = ArrayAdapter(this, R.layout.layout_contact, ContactObject.getSimpleContactList())

        // add a listener
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val name = adapterView.getItemAtPosition(i) as String
            Toast.makeText(this@MainActivity, String.format(Locale.getDefault(), "%s %s tapped!", name), Toast.LENGTH_SHORT).show()
        }
    }
}
