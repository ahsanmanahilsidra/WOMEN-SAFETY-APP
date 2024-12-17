package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.women_safety_app.databinding.FragmentProfileBinding


class Profile : Fragment() {

private lateinit var binding:FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentProfileBinding.inflate(layoutInflater)
        binding.EditProfile.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.edit_profile)
        })
        binding.Logout.setOnClickListener(View.OnClickListener {

            findNavController().navigate(R.id.login, null, null)
        })
        return binding.root
    }

}