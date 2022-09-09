package com.bm.f2ffacetoface.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bm.f2ffacetoface.R
import com.bm.f2ffacetoface.databinding.ActivityAboutpageBinding
import com.bm.f2ffacetoface.databinding.ActivityFeedBinding

class Aboutpage : AppCompatActivity() {

    private lateinit var binding: ActivityAboutpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutpageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}