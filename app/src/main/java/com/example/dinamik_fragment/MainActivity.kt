package com.example.dinamik_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dinamik_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            val blankFragment = BlankFragment()
            val fragmentManager = supportFragmentManager

            btnClick.setOnClickListener {
                fragmentManager.beginTransaction().add(R.id.my_container,blankFragment)
                    .commit()
                Toast.makeText(this@MainActivity, "Bosildi", Toast.LENGTH_SHORT).show()
            }
        }

    }
}