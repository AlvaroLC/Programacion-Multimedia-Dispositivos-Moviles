package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvarolc.pmpd_playground.databinding.ActivityUt03Ex06Binding

class Ut03Ex06Activity : AppCompatActivity() {

    private val binding: ActivityUt03Ex06Binding by lazy {
        ActivityUt03Ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.actionLoadFragment1.setOnClickListener {
            addFragment(binding.form.id, Ut02Ex05FormFragment.createInstance(), "1")
        }
        binding.actionLoadFragment2.setOnClickListener {
            addFragment(binding.list.id, Ut02Ex05ListFragment.createInstance(), "2")
        }
        binding.actionRemoveFragment2.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentByTag("2")
            fragment?.let {
                removeFragment(fragment)
            }
        }
        binding.actionReplaceFragment1.setOnClickListener {
            replaceFragment(binding.containerFragment.id, Ut02Ex05FormFragment.createInstance())
        }
        binding.actionReplaceFragment2.setOnClickListener {
            replaceFragment(binding.containerFragment.id, Ut02Ex05ListFragment.createInstance())
        }
    }


    private fun addFragment(layoutId: Int, fragment: Fragment, tag: String) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        //Layout ID, Fragment, TAG
        fragmentTransition.add(layoutId, fragment, tag)
        fragmentTransition.commit() //aplica los cambios
    }

    private fun removeFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.remove(fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit() //aplica los cambios
    }

    private fun replaceFragment(layoutId: Int, fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(layoutId, fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit() //aplica los cambios
    }
}