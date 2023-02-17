package com.naturalmotion.csrclassic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.naturalmotion.csrclassic.databinding.FragmentGamamamamma33Binding
import kotlinx.coroutines.delay
import kotlin.random.Random


class Gamamamamma33Fragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                val num = Random.nextInt(from = 100, until = 1000)
                Toast.makeText(requireContext(), "Earned $num points", Toast.LENGTH_SHORT).show()
                delay(3000)
                yhyhy5hy59hy5()
            }

        } catch (e: Exception) {
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun yhyhy5hy59hy5() {
        findNavController().navigate(R.id.action_gamamamamma33Fragment_to_gamamamamama1Fragment)
    }

    override fun onDestroy() {
        fragmentPlay3Binding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Oops something bad, please try again...",
            Toast.LENGTH_SHORT
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentPlay3Binding = FragmentGamamamamma33Binding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentPlay3Binding: FragmentGamamamamma33Binding? = null
    private val binding
        get() = fragmentPlay3Binding
            ?: throw RuntimeException("FragmentGamamamamma33Binding = null")


}