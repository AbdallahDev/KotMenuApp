package com.example.user.kotmenuapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_context.*

class ContextAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menu.add(100, 100, 100, "Red")
        menu.add(100, 200, 100, "Green")
        menu.add(100, 300, 100, "Blue")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        if (item.itemId == 100)
            textView.setTextColor(Color.RED)
        else if (item.itemId == 200)
            textView.setTextColor(Color.GREEN)
        else if (item.itemId == 300)
            textView.setTextColor(Color.BLUE)


        return super.onContextItemSelected(item)
    }
}
