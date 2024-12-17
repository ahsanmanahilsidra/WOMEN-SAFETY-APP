package com.example.women_safety_app

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.women_safety_app.databinding.FragmentDashboardBinding
import com.google.android.material.tabs.TabLayoutMediator


class dashboard : Fragment() {
    private lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       binding= FragmentDashboardBinding.inflate(layoutInflater)
        val adapter = ViewPagerAdapter(requireActivity() as AppCompatActivity)
        binding.viewpager.adapter = adapter

        // Link the TabLayout and ViewPager2 together
        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            // Set tab titles
            when (position) {
                0 -> tab.text = "Quotes"
                1 -> tab.text = "Map"
                2 -> tab.text = "Safety Advisor"
            }
        }.attach()

        //handel on back press
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {

showExitConfirmationDialog()
        }
        return binding.root
    }
    private inner class ViewPagerAdapter(activity: AppCompatActivity) :
        FragmentStateAdapter(activity) {

        override fun getItemCount(): Int = 3 // Number of tabs

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> Quets()  // Replace with actual Fragment for Quotes
                1 -> MapsFragment()     // Replace with actual Fragment for Map
                2 ->safety_Advisor() // Replace with actual Fragment for Safety Advisor
                else -> throw IllegalStateException("Unexpected position $position")
            }
        }
    }

    private fun showExitConfirmationDialog() {
        val alertDialog = AlertDialog.Builder(requireContext())
            .setTitle("Exit App")
            .setMessage("Really you want to exit app?")
            .setPositiveButton("Yes") { dialog, which ->
                // Move the app to the background instead of exiting
                requireActivity().moveTaskToBack(true)
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, which ->
                // Dismiss the dialog, do nothing
                dialog.dismiss()
            }
            .create()

        alertDialog.show()
    }


}