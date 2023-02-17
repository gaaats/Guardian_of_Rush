package com.naturalmotion.csrclassic

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.naturalmotion.csrclassic.gktkgkgkt.UHHufhrhfhrihiuhurf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class OneeejgijgitjitgFragment : Fragment() {
    private lateinit var gtgt5gt59tg59g5t: Context

    val g2gt2gtgt5gt by activityViewModel<UHHufhrhfhrihiuhurf>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_oneeejgijgitjitg, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgt5gt59tg59g5t=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        g2gt2gtgt5gt.hy2juj5uj5uj5uj95(gtgt5gt59tg59g5t)

        fgotgjtjgjgthutguigt()

    }

    private fun fgotgjtjgjgthutguigt() {
        findNavController().navigate(R.id.action_oneeejgijgitjitgFragment_to_tvooyohoyohykhyFragment)
    }
}