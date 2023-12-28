package com.example.toolberdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.profile ->{
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.setting ->{
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.share ->{
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.logout ->{
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
                true
            }
            else-> super.onOptionsItemSelected(item)
        }

    }

}