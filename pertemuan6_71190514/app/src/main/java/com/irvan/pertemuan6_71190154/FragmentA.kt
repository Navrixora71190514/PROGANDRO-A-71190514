package com.irvan.pertemuan6_71190154

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentA: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewA = inflater.inflate(R.layout.fragment_a, container, false)
        val buttonA = viewA.findViewById<Button>(R.id.buttonA)

        buttonA.setOnClickListener {
            val i = Intent(context, Page2Activity::class.java);
            startActivity(i)
            Toast.makeText(context,"Anda berada di Halaman 2",Toast.LENGTH_SHORT).show()
        }
        return viewA
    }
}