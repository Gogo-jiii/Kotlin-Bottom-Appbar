package com.example.kotlin_bottom_app_bar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomAppBar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.page_1 -> Toast.makeText(this@MainActivity,
                    "Android", Toast.LENGTH_SHORT)
                    .show()
                R.id.page_2 -> Toast.makeText(this@MainActivity,
                    "Settings", Toast.LENGTH_SHORT)
                    .show()
            }
            false
        }

        bottomAppBar.setNavigationOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Navigation icon",
                Toast.LENGTH_SHORT
            ).show()
        }

        fab.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "Floating Acton Button", Toast.LENGTH_SHORT)
                .show()
        }
    }
}