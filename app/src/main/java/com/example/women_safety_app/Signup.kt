package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.women_safety_app.databinding.FragmentSignupBinding
import com.example.women_safety_app.databinding.FragmentSignupGuardianBinding



class Signup : Fragment() {


private lateinit var binding:FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentSignupBinding.inflate(layoutInflater)
        binding.Singup.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.homefragment)
        })
        return binding.root
    }



}