package com.irvan.pertemuan7_71190514

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //siapkan data dummy
        val listContact = ArrayList<Contact>()
        listContact.add(Contact("Bang CR", "+6287777777777", R.mipmap.cr,"Kelurahan Sumber RT 05 RW 07, Kecamatan Banjarsari, Portugal.","siuuu4life@cr.com"))
        listContact.add(Contact("Messiun", "+6210301010300", R.mipmap.messi,"Kelurahan Sendang, Kecamatan Argowilis, Argentina","medioker10@lm.com"))
        listContact.add(Contact("Lewy", "+62100000099999",  R.mipmap.lewy,"Godean, Sleman, Polandia","lewyselalusabar@gmail.com"))

        //siapkan RecyclerView
        val rvContact = findViewById<RecyclerView>(R.id.rvListContact)
        rvContact.layoutManager = LinearLayoutManager(this)
        val adapter = ContactAdapter(listContact)
        rvContact.adapter = adapter


    }
}