package com.example.women_safety_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.women_safety_app.databinding.FragmentForgotPasswordBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Forgot_password.newInstance] factory method to
 * create an instance of this fragment.
 */
class Forgot_password : Fragment() {


    private lateinit var binding: FragmentForgotPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentForgotPasswordBinding.inflate(layoutInflater)
     binding.back.setOnClickListener(View.OnClickListener {
         activity?.onBackPressed()
     })
        return binding.root
    }


}