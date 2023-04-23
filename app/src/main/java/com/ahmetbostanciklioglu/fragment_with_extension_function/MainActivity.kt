package com.ahmetbostanciklioglu.fragment_with_extension_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpFragment()
    }

    private fun setUpFragment() {
        replaceActivityWithFragment(MyFragment())
    }
}