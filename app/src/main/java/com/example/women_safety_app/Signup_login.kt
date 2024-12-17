package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.women_safety_app.databinding.FragmentSignupLoginBinding


class Signup_login : Fragment() {
    private lateinit var binding: FragmentSignupLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentSignupLoginBinding.inflate(layoutInflater)

        binding.signup.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.signup)
        })
        binding.Login.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.login)
        })
        binding.guardian.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.signup_guardian)
        })
//        handel backpress
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {

            showExitConfirmationDialog()
        }
        return binding.root
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