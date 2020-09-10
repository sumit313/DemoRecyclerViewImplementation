package com.example.demorecyclerviewimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.demorecyclerviewimplementation.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val adapter = RecyclerViewAdapter()
        binding.recyclerViewItemList.adapter = adapter
        adapter.submitList(DataSource.dataList)
        binding.lifecycleOwner = this
        button1.setOnClickListener(View.OnClickListener {
            adapter.submitList(DataSource.newDataList)
        })
    }
}
