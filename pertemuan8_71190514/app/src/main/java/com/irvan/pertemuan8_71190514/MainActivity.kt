package com.irvan.pertemuan8_71190514

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //memasang Toolbar
        setSupportActionBar(findViewById(R.id.toolbar_default))
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //instansiasi ViewPager
        val viewPager = findViewById<ViewPager2>(R.id.pager)

        //Memasukkan seluruh fragment ke dalam ArrayList
        val listFragment: ArrayList<Fragment> = arrayListOf(FragmentSatu(), FragmentDua(), FragmentTiga())

        //instansiasi Adapter untuk ViewPager
        val pagerAdapter = PagerAdapter(this, listFragment)
        viewPager.adapter = pagerAdapter
        setSupportActionBar(findViewById(R.id.toolbar_default))
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
    class PagerAdapter(val activity: AppCompatActivity, val listFragment: ArrayList<Fragment>): FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = listFragment.size

        override fun createFragment(position: Int): Fragment = listFragment.get(position)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu_default, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.menu_profile -> {
            Toast.makeText(this,"Menu Profile",Toast.LENGTH_LONG).show()
            val viewPagerProfile = findViewById<ViewPager2>(R.id.pager)
            viewPagerProfile.setCurrentItem(1)
            true
        }
        R.id.menu_settings -> {
            Toast.makeText(this,"Menu Settings",Toast.LENGTH_LONG).show()
            val viewPagerSetting = findViewById<ViewPager2>(R.id.pager)
            viewPagerSetting.setCurrentItem(2)
            true
        }
        R.id.menu_camera -> {
            Toast.makeText(this,"Menu Camera",Toast.LENGTH_LONG).show()
            val viewPagerCamera = findViewById<ViewPager2>(R.id.pager)
            viewPagerCamera.setCurrentItem(0)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}