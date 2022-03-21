package com.irvan.pertemuan6_71190154

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentC: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewC = inflater.inflate(R.layout.fragment_c, container, false)
        val buttonC = viewC.findViewById<Button>(R.id.buttonC)

        buttonC.setOnClickListener {
            val i = Intent(context, MainActivity::class.java);
            startActivity(i)
            Toast.makeText(context,"Anda berada di Halaman 1",Toast.LENGTH_SHORT).show()
        }
        return viewC
    }
}