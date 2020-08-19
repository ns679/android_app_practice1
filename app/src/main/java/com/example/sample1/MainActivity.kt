package com.example.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvMenu = findViewById<ListView>(R.id.lvmenu)
        lvMenu.onItemClickListener = ListItemClickListenr()
    }
    private inner class ListItemClickListenr:AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as String
            val show = "選んだ企業" + item
            Toast.makeText(applicationContext,show,Toast.LENGTH_LONG).show()
        }
    }
}
