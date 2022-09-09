package com.bm.f2ffacetoface.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import com.bm.f2ffacetoface.R
import com.bm.f2ffacetoface.databinding.ActivityAboutpageBinding.inflate
import com.bm.f2ffacetoface.databinding.ActivityFeedBinding
import com.bm.f2ffacetoface.databinding.ActivityFeedBinding.inflate
import com.bm.f2ffacetoface.databinding.ActivityMainBinding.inflate
import com.bm.f2ffacetoface.databinding.ActivitySettingpageBinding

class Settingpage : AppCompatActivity() {

    private lateinit var binding: ActivitySettingpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingpageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}