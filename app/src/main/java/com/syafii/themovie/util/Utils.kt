/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

/*Toast*/
fun AppCompatActivity.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Fragment.showToast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/*Hide Keyboard*/
fun Activity.hideKeyboard() {
    val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val view = currentFocus
    if (view != null) {
        inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}

/*Intent*/
fun <T> Fragment.openActivity(destination: Class<T>, bundleKey: String, id: String) {
    val intent = Intent(requireContext(), destination)
    intent.putExtra(bundleKey, id)
    startActivity(intent)
}

fun <T> Fragment.openActivity(destination: Class<T>) {
    val intent = Intent(requireContext(), destination)
    startActivity(intent)
}

fun <T> Activity.openActivity(destination: Class<T>, bundleKey: String, id: String) {
    val intent = Intent(this, destination)
    intent.putExtra(bundleKey, id)
    startActivity(intent)
}

fun <T> Activity.openActivity(destination: Class<T>) {
    val intent = Intent(this, destination)
    startActivity(intent)
}

/*Format Calender*/
fun String.convertCalendarDate(): String {
    val from = SimpleDateFormat("yyy-MM-dd")
    val to = SimpleDateFormat("dd-MMM")
    var date: Date?
    try {
        date = from.parse(this)
        return to.format(date)
    } catch (e: Exception) {
        e.printStackTrace()
        return this
    }
}


