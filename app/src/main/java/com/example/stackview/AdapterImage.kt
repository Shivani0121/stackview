package com.example.stackview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


/*class AdapterImage(val word: MutableList<String>,val image:MutableList<Int>,val context: Context,val resource: Int) :
    ArrayAdapter<String>(word,image,context, resource) {*/
    class AdapterImage(private val word: ArrayList<String>, private val image: ArrayList<Int>,private val context: Context)
        : ArrayAdapter<String>(context, R.layout.adapter_component, word){
    override fun areAllItemsEnabled(): Boolean {
        return false
    }

    override fun getCount(): Int {
        return word.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //  return super.getView(position, convertView, parent)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.adapter_component, parent,false)



        val textview = rowView?.findViewById<TextView>(R.id.text)
        val imageview = rowView?.findViewById<ImageView>(R.id.image)
        textview?.text = word[position]
        imageview?.setImageResource(image[position])
        return rowView
    }

    override fun getItem(position: Int): String {
        return word.get(position)
    }

}
