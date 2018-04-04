package com.example.user.kotmenuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when {
            item.itemId == R.id.item_copy -> Toast.makeText(this, "Copy", Toast.LENGTH_LONG).show()
            item.itemId == R.id.item_cut -> Toast.makeText(this, "Cut", Toast.LENGTH_LONG).show()
            item.itemId == R.id.item_paste -> Toast.makeText(this, "Paste", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }


}
