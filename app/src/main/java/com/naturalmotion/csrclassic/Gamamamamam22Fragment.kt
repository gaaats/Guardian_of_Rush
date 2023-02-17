package com.naturalmotion.csrclassic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.naturalmotion.csrclassic.databinding.FragmentGamamamamam22Binding
import com.naturalmotion.csrclassic.goktijtigt.IJjfjjgtigtjgt
import com.naturalmotion.csrclassic.goktijtigt.Jjgtjgtjgt


class Gamamamamam22Fragment : Fragment(), IJjfjjgtigtjgt {


    private var yhyhyhyhyhyhyhy: FragmentGamamamamam22Binding? = null
    private val startyBinding
        get() = yhyhyhyhyhyhyhy
            ?: throw RuntimeException("FragmentGamamamamam22Binding = null")

    private var gameViev: Jjgtjgtjgt? = null


    override fun onDestroy() {
        yhyhyhyhyhyhyhy = null
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        yhyhyhyhyhyhyhy = FragmentGamamamamam22Binding.inflate(inflater, container, false)
        return startyBinding.root
    }

    val intList = listOf(
        R.drawable.ddddiam,
    )

    override fun clclcllcgimi(score: Int) {
        val jujuujuj = "Score : $score"
        startyBinding.root.removeView(gameViev)
        startyBinding.tvScoreGame1.text = jujuujuj
        startyBinding.btnStart.visibility = View.VISIBLE
        gtjgtjigtjigt()
        gameViev = null

        gtkgtkgkogtk()
    }

    private fun gtjgtjigtjigt() {
        startyBinding.tvScoreGame1.visibility = View.VISIBLE
        startyBinding.imgLogoGame1.visibility = View.VISIBLE
    }

    private fun gtkgtkgkogtk() {
        findNavController().navigate(R.id.action_gamamamamam22Fragment_to_gamamamamma33Fragment)
    }

    private fun gthyhyhhyhy() {
        Toast.makeText(
            requireContext(),
            "Oops error, please try again...",
            Toast.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun gtkktgtk() {
        startyBinding.tvScoreGame1.visibility = View.GONE
        startyBinding.imgLogoGame1.visibility = View.GONE
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {
            startyBinding.btnStart.setOnClickListener {
                gameViev =
                    Jjgtjgtjgt(requireContext(), this, R.drawable.character, intList)
                gameViev!!.setBackgroundResource(R.drawable.gamy)
                gameViev!!.background.alpha = 230
                startyBinding.root.addView(gameViev)
                startyBinding.btnStart.visibility = View.GONE
                gtkktgtk()
            }
        } catch (e: Exception) {
            gthyhyhhyhy()
        }

        super.onViewCreated(view, savedInstanceState)
    }


}