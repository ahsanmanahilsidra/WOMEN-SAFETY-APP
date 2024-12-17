package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.women_safety_app.databinding.FragmentHomefragmentBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView


class Homefragment : Fragment() {
private lateinit var binding: FragmentHomefragmentBinding

    private lateinit var navController: NavController
    private lateinit var bottomAppBar: BottomAppBar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentHomefragmentBinding.inflate(layoutInflater)
        binding.profileImage.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.profile)
        })
        val bottomNavigationView: BottomNavigationView = binding.bottombar

        // Find the nested NavHostFragment within the current HomeFragment
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navhost) as NavHostFragment

        // Get the NavController of the nested NavHostFragment
        val navController: NavController = navHostFragment.navController

        // Connect the BottomNavigationView to the NavController
        bottomNavigationView.setupWithNavController(navController)

        // Optionally, you can listen for item selections and perform custom actions if needed:
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.dashboard -> {
                    navController.navigate(R.id.dashboard)
                    binding.heading.text="Home"
                    true
                }
                R.id.sos -> {
                    navController.navigate(R.id.sos)
                    binding.heading.text="SOS"
                    true
                }
                R.id.chat -> {
                    navController.navigate(R.id.chat)
                    binding.heading.text="Chat"
                    true
                }
                R.id.notifications -> {
                    navController.navigate(R.id.notifications)
                    binding.heading.text="Notifications"
                    true
                }
                else -> false
            }
        }


        return binding.root
    }



}