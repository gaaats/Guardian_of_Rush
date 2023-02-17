package com.naturalmotion.csrclassic

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.naturalmotion.csrclassic.gktkgkgkt.UHHufhrhfhrihiuhurf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class TvooyohoyohykhyFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gtgtgtgtgt.hy2hy6h59u59.observe(viewLifecycleOwner) {
            if (it!=null) {
                country = it.gthyhyhyhyjiji
                gthyhyujuj.edit().putString("country", country).apply()
                findNavController().navigate(R.id.action_tvooyohoyohykhyFragment_to_thrfreeeeffeFragment)
            }
        }
    }

    override fun onStart() {
        super.onStart()

    }

    private lateinit var gthyhyhhy: Context
    val gthyhyujuj: SharedPreferences by inject(named("SharedPreferences"))
    val gtgtgtgtgt by activityViewModel<UHHufhrhfhrihiuhurf>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tvooyohoyohykhy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthyhyhhy = context
    }
}