package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.women_safety_app.databinding.FragmentLoginBinding



class Login : Fragment() {

private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentLoginBinding.inflate(layoutInflater)
        binding.login.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.homefragment)
        })
        binding.forgotPassword.setOnClickListener(View.OnClickListener {

            findNavController().navigate(R.id.forgot_password)
        })
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.signup_login)

        }

        return binding.root

    }

}