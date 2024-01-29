package com.kh.presentation.util

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


fun Fragment.closeFragment() {
    this.findNavController().popBackStack()
}

fun View.makeVisible() {
    this.visibility = View.VISIBLE
}

fun View.makeGone() {
    this.visibility = View.GONE
}




