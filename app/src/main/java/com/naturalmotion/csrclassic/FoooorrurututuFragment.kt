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


class FoooorrurututuFragment : Fragment() {
    val yhy59h59hy59hy by activityViewModel<UHHufhrhfhrihiuhurf>(named("MainModel"))
    val hyhyhy5hy55hy: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var appCamp: String
    private lateinit var mContecxt: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContecxt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_foooorrurututu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val hyhyhjuj59uj95ju = hyhyhy5hy55hy.getString("apps", null)
        val hyhy5hy5hy59hy = hyhyhy5hy55hy.getString("appCamp", null)

        if (hyhyhjuj59uj95ju=="1" && hyhy5hy5hy59hy == null) {
            yhy59h59hy59hy.hy5ju5uj59uj5(mContecxt)
            yhy59h59hy59hy.hyju2j9959.observe(viewLifecycleOwner) {
                if (it != null) {
                    appCamp = it.toString()
                    hyhyhy5hy55hy.edit().putString("appCamp", appCamp).apply()
                    rffrhhuihrfhhrf()
                }
            }
        } else {
            rffrhhuihrfhhrf()
        }
    }

    private fun rffrhhuihrfhhrf() {
        findNavController().navigate(R.id.action_foooorrurututuFragment_to_firiirriirrveveveFragment)
    }
}