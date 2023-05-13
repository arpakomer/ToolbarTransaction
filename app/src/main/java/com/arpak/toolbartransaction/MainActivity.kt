package com.arpak.toolbartransaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.arpak.toolbartransaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbar.title = "Toolbar Menü"
        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        val itemSearch = menu!!.findItem(R.id.action_search)
        val searchView = itemSearch.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.action_info -> {
                Toast.makeText(applicationContext, "Bilgi Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_setting -> {
                Toast.makeText(applicationContext, "Ayarlar Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_exit -> {
                Toast.makeText(applicationContext, "Çıkış Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_add -> {
                Toast.makeText(applicationContext, "Ekle Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_search -> {
                Toast.makeText(applicationContext, "Arama Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }


     override fun onQueryTextSubmit(query: String): Boolean {

        Log.e("Harf Girdikçe Oluşan Sonucu",query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {

        Log.e("Gönderilen Arama Sonucu",newText)
        return true
    }



}

