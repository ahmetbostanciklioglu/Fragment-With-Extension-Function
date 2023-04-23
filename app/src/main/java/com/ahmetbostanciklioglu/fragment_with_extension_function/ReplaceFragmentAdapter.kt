package com.ahmetbostanciklioglu.fragment_with_extension_function

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.replaceActivityWithFragment(fragment: Fragment) {

    supportFragmentManager.activityToFragmentTransaction {
        replace(
            R.id.fragment_container_view,
            fragment
        ).addToBackStack(fragment.javaClass.name)
    }
}

fun androidx.fragment.app.FragmentManager.activityToFragmentTransaction(param: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().param().commit()
}