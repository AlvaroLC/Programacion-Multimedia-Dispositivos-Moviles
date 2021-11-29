package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityUt03Ex06Binding
import com.alvarolc.pmpd_playground.ut3.ex06.presentation.Ut03Ex06FormFragment
import com.alvarolc.pmpd_playground.ut3.ex06.presentation.Ut03Ex06ListFragment

class Ut03Ex06Activity : AppCompatActivity() {

    private val bindingActivity: ActivityUt03Ex06Binding by lazy {
        ActivityUt03Ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingActivity.root)
        setupCustomToolbar()

    }

    private fun setupCustomToolbar() {
        setSupportActionBar(bindingActivity.toolbar)
        replaceFragment(bindingActivity.containerFragment.id, Ut03Ex06FormFragment.createInstance())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_activity_ut03_ex06, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.fragment_change -> {

                if (supportActionBar?.title == getString(R.string.title_form)){
                    replaceFragment(bindingActivity.containerFragment.id, Ut03Ex06ListFragment.createInstance())
                    supportActionBar?.title = getString(R.string.title_list)
                }else{
                    replaceFragment(bindingActivity.containerFragment.id, Ut03Ex06FormFragment.createInstance())
                    supportActionBar?.title = getString(R.string.title_form)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


/*
    private fun setupView() {


        bindingActivity.buttonFragment1.setOnClickListener{
            addFragment(bindingActivity.actionLoadFragment1.id, Ut03Ex06FormFragment.createInstance(), "1")
        }
        bindingActivity.buttonFragment2.setOnClickListener {
            addFragment(bindingActivity.actionLoadFragment2.id, Ut03Ex06ListFragment.createInstance(), "2")
        }

        bindingActivity.buttonFragment1.setOnClickListener {
            val fragment1 = supportFragmentManager.findFragmentByTag("1")
            fragment1?.let {
                replaceFragment(bindingActivity.actionLoadFragment1.id, Ut03Ex06FormFragment.createInstance())
            }


            val fragment2 = supportFragmentManager.findFragmentByTag("2")
            fragment2?.let {
                replaceFragment(bindingActivity.actionLoadFragment1.id, Ut03Ex06ListFragment.createInstance())
            }
        }


        bindingActivity.actionRemoveFragment2.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentByTag("2")
            fragment?.let {
                removeFragment(fragment)
            }
        }
        bindingActivity.buttonFragment1.setOnClickListener {
            replaceFragment(bindingActivity.actionLoadFragment1.id, Ut03Ex06FormFragment.createInstance())
        }
        bindingActivity.buttonFragment2.setOnClickListener {
            replaceFragment(bindingActivity.actionLoadFragment1.id, Ut03Ex06ListFragment.createInstance())
        }
    }




    private fun removeFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.remove(fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit() //aplica los cambios
    }*/

    private fun addFragment(layoutId: Int, fragment: Fragment, tag: String) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        //Layout ID, Fragment, TAG
        fragmentTransition.add(layoutId, fragment, tag)
        fragmentTransition.commit() //aplica los cambios
    }

    private fun replaceFragment(layoutId: Int, fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(layoutId, fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit() //aplica los cambios
    }
}