package com.naturalmotion.csrclassic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.naturalmotion.csrclassic.databinding.FragmentGamamamamama1Binding


class Gamamamamama1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        y5hy55hy59hy = FragmentGamamamamama1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnTop.setOnClickListener {
                findNavController().navigate(R.id.action_gamamamamama1Fragment_to_gamamamamam22Fragment)
            }



        } catch (e: Exception) {
            gth2t2h26hy()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        y5hy55hy59hy = null
        super.onDestroy()
    }

    private var y5hy55hy59hy: FragmentGamamamamama1Binding? = null
    private val binding
        get() = y5hy55hy59hy ?: throw RuntimeException("FragmentGamamamamama1Binding = null")


    private fun gth2t2h26hy() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}