package com.kenruizinoue.listviewtemplate01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var colorArrays = resources.getStringArray(R.array.Colors)
        // simple_list_item_1 is a built-in layout which hosts a TextView only
        var arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colorArrays)

        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterView, view, position: Int, id: Long ->
            Toast.makeText(this, colorArrays[position], Toast.LENGTH_LONG).show()
        }
    }
}