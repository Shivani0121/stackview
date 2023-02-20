package com.example.stackview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stackview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapter= AdapterImage(numberWord()!!,relatedImages()!!,this)
         binding.stackView.adapter=adapter
    }

    private fun numberWord(): ArrayList<String>? {
        val word: ArrayList<String> = ArrayList()
        word.add("It's Beautiful")
        word.add("It's Glorious")
        word.add("Save Earth")
        word.add("Water is life!!")
        word.add("Save Tree! Save Life!")
        return word
    }
    private fun relatedImages(): ArrayList<Int>? {
        val image: ArrayList<Int> = ArrayList()
        image.add(R.drawable.img)
        image.add(R.drawable.img_1)
        image.add(R.drawable.img_2)
        image.add(R.drawable.img_3)
        image.add(R.drawable.img_4)
        return image
    }
}