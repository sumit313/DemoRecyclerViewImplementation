package com.example.demorecyclerviewimplementation

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("itemTextString")
fun TextView.setItemText(item: ListDataDemo) {
    text = item.text
}
