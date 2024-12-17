package com.example.women_safety_app

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.women_safety_app.databinding.FragmentSignupGuardianBinding


class Signup_guardian : Fragment() {

private lateinit var binding: FragmentSignupGuardianBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentSignupGuardianBinding.inflate(layoutInflater)
       binding.Singup.setOnClickListener(View.OnClickListener {
           binding.Singup.setOnClickListener(View.OnClickListener {
               findNavController().navigate(com.example.women_safety_app.R.id.homefragment)
           })
       })
        // Reference to the TextInputLayout and AutoCompleteTextView
        val relationInputLayout = binding.menu
        val relationAutoComplete = binding.relation

        // Sample list of relationship options
        val relationshipOptions = arrayOf(
            "Father",
            "Mother",
            "Husband",
            "Brother",
            "Sister",
            "Son",
            "Daughter",
            "Uncle",
            "Aunt",
            "Cousin",
            "Nephew",
            "Niece",
            "Other"
        )

        // Create an ArrayAdapter for AutoCompleteTextView
        val adapter = ArrayAdapter(requireContext(), R.layout.simple_dropdown_item_1line, relationshipOptions)

        // Set the adapter for AutoCompleteTextView
        relationAutoComplete.setAdapter(adapter)

        // Optional: Handle item selection (for example, you can get the selected value)
        relationAutoComplete.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()
            // Use the selected item as needed (e.g., display it in a TextView or use it in a form)
        }

        return binding.root
    }



}