package com.naturalmotion.csrclassic

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class FiriirriirrveveveFragment : Fragment() {
    private lateinit var hyhy5hy95hy95hy: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhy5hy95hy95hy = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_firiirriirrveveve, container, false)
    }

    override fun onStart() {
        super.onStart()
        val hy5hy59hy95hy59 = shareP.getString("country", null)
        val hy2hy5hy9hy59 = shareP.getString("appCamp", null)
        val gt5 = shareP.getString("deepSt", null)
        val gt2h5hy5hy59hy = shareP.getString("countryDev", null)
        val thyjuju5u59 = shareP.getString("apps", null)
        val gyhuju = shareP.getString("wv", null)
        val ghyhy6ju59j = shareP.getString("mainId", null)
        val hyhuju5j5u9 = "com.naturalmotion.csrclassic"
        val ghyh5yh5hy9 = Build.VERSION.RELEASE
        val gthy5yh595hy = MyTracker.getTrackerParams()
        gthy5yh595hy.customUserId = ghyhy6ju59j
        val hyhy5hy95h: String? = shareP.getString("instId", null)

        val yh5yh9h55hy = Intent(hyhy5hy95hy95hy, VebBrovvvissssrerActivity2::class.java)
        val gt2hy5hy9y = Intent(hyhy5hy95hy95hy, GaaaagagagaActivity2::class.java)

        val gtg5yh5y5yh95hy = "deviceID="
        val gtyh5y5hy5 = "sub_id_1="
        val gthy5hy55 = "ad_id="
        val gtyhy59u95ju = "sub_id_4="
        val gth5yh5y5j9u5ju5 = "sub_id_5="
        val ythyh5y9h59y = "sub_id_6="
        val yhy55hy = "naming"
        val gth2y5hy59hy = "deeporg"

        val gth5y95hy5y = AppsFlyerLib.getInstance().getAppsFlyerUID(hyhy5hy95hy95hy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        th5yh95y5hy5hy(ghyhy6ju59j.toString())



        val gth2hy6 = "$gyhuju$gtyh5y5hy5$hy2hy5hy9hy59&$gtg5yh5y5yh95hy$gth5y95hy5y&$gthy5hy55$ghyhy6ju59j&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$yhy55hy"
        val gthy2hju59uj = "$gyhuju$gtg5yh5y5yh95hy$ghyhy6ju59j&$gthy5hy55$hyhy5hy95h&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$yhy55hy"
        val gthyjuju5ki6ikikik = "$gyhuju$gtyh5y5hy5$gt5&$gtg5yh5y5yh95hy$gth5y95hy5y&$gthy5hy55$ghyhy6ju59j&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$gth2y5hy59hy"
        val gtgthyh5y5hy95y = "$gyhuju$gtyh5y5hy5$gt5&$gtg5yh5y5yh95hy$ghyhy6ju59j&$gthy5hy55$hyhy5hy95h&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$gth2y5hy59hy"

        when(thyjuju5u59) {
            "1" ->
                if(hy2hy5hy9hy59 != "null") {
                    shareP.edit().putString("link", gth2hy6).apply()
                    startActivity(yh5yh9h55hy)
                    activity?.finish()
                } else if (gt5!=null||gt2h5hy5hy59hy!!.contains(hy5hy59hy95hy59.toString())) {
                    shareP.edit().putString("link", gthyjuju5ki6ikikik).apply()
                    startActivity(yh5yh9h55hy)
                    activity?.finish()
                } else {
                    startActivity(gt2hy5hy9y)
                    activity?.finish()
                }
            "0" ->
                if(gt5!=null) {
                    shareP.edit().putString("link", gtgthyh5y5hy95y).apply()
                    startActivity(yh5yh9h55hy)
                    activity?.finish()
                } else if (gt2h5hy5hy59hy!!.contains(hy5hy59hy95hy59.toString())) {
                    shareP.edit().putString("link", gthy2hju59uj).apply()
                    startActivity(yh5yh9h55hy)
                    activity?.finish()
                } else {
                    startActivity(gt2hy5hy9y)
                    activity?.finish()
                }
        }

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val hy5hy59hy95hy59 = shareP.getString("country", null)
//        val hy2hy5hy9hy59 = shareP.getString("appCamp", null)
//        val gt5 = shareP.getString("deepSt", null)
//        val gt2h5hy5hy59hy = shareP.getString("countryDev", null)
//        val thyjuju5u59 = shareP.getString("apps", null)
//        val gyhuju = shareP.getString("wv", null)
//        val ghyhy6ju59j = shareP.getString("mainId", null)
//        val hyhuju5j5u9 = "com.naturalmotion.csrclassic"
//        val ghyh5yh5hy9 = Build.VERSION.RELEASE
//        val gthy5yh595hy = MyTracker.getTrackerParams()
//        gthy5yh595hy.customUserId = ghyhy6ju59j
//        val hyhy5hy95h: String? = shareP.getString("instId", null)
//
//        val yh5yh9h55hy = Intent(hyhy5hy95hy95hy, VebBrovvvissssrerActivity2::class.java)
//        val gt2hy5hy9y = Intent(hyhy5hy95hy95hy, GaaaagagagaActivity2::class.java)
//
//        val gtg5yh5y5yh95hy = "deviceID="
//        val gtyh5y5hy5 = "sub_id_1="
//        val gthy5hy55 = "ad_id="
//        val gtyhy59u95ju = "sub_id_4="
//        val gth5yh5y5j9u5ju5 = "sub_id_5="
//        val ythyh5y9h59y = "sub_id_6="
//        val yhy55hy = "naming"
//        val gth2y5hy59hy = "deeporg"
//
//        val gth5y95hy5y = AppsFlyerLib.getInstance().getAppsFlyerUID(hyhy5hy95hy95hy)
//        AppsFlyerLib.getInstance().setCollectAndroidID(true)
//
//        th5yh95y5hy5hy(ghyhy6ju59j.toString())
//
//        Log.d("lolo", "${hy5hy59hy95hy59}")
//
//
//        val gth2hy6 = "$gyhuju$gtyh5y5hy5$hy2hy5hy9hy59&$gtg5yh5y5yh95hy$gth5y95hy5y&$gthy5hy55$ghyhy6ju59j&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$yhy55hy"
//        val gthy2hju59uj = "$gyhuju$gtg5yh5y5yh95hy$ghyhy6ju59j&$gthy5hy55$hyhy5hy95h&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$yhy55hy"
//        val gthyjuju5ki6ikikik = "$gyhuju$gtyh5y5hy5$gt5&$gtg5yh5y5yh95hy$gth5y95hy5y&$gthy5hy55$ghyhy6ju59j&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$gth2y5hy59hy"
//        val gtgthyh5y5hy95y = "$gyhuju$gtyh5y5hy5$gt5&$gtg5yh5y5yh95hy$ghyhy6ju59j&$gthy5hy55$hyhy5hy95h&$gtyhy59u95ju$hyhuju5j5u9&$gth5yh5y5j9u5ju5$ghyh5yh5hy9&$ythyh5y9h59y$gth2y5hy59hy"
//
//        when(thyjuju5u59) {
//            "1" ->
//                if(hy2hy5hy9hy59 != "null") {
//                    shareP.edit().putString("link", gth2hy6).apply()
//                    Log.d("lolo", "${gth2hy6}")
//                    Toast.makeText(requireContext(), "${gth2hy6}", Toast.LENGTH_SHORT).show()
//                    startActivity(yh5yh9h55hy)
//                    activity?.finish()
//                } else if (gt5!=null||gt2h5hy5hy59hy!!.contains(hy5hy59hy95hy59.toString())) {
//                    Log.d("lolo", "${gthyjuju5ki6ikikik}")
//                    Toast.makeText(requireContext(), "${gthyjuju5ki6ikikik}", Toast.LENGTH_SHORT).show()
//                    shareP.edit().putString("link", gthyjuju5ki6ikikik).apply()
//                    startActivity(yh5yh9h55hy)
//                    activity?.finish()
//                } else {
//                    startActivity(gt2hy5hy9y)
//                    activity?.finish()
//                }
//            "0" ->
//                if(gt5!=null) {
//                    Log.d("lolo", "${gtgthyh5y5hy95y}")
//                    Toast.makeText(requireContext(), "${gtgthyh5y5hy95y}", Toast.LENGTH_SHORT).show()
//                    shareP.edit().putString("link", gtgthyh5y5hy95y).apply()
//                    startActivity(yh5yh9h55hy)
//                    activity?.finish()
//                } else if (gt2h5hy5hy59hy!!.contains(hy5hy59hy95hy59.toString())) {
//                    Log.d("lolo", "${gthy2hju59uj}")
//                    Toast.makeText(requireContext(), "${gthy2hju59uj}", Toast.LENGTH_SHORT).show()
//                    shareP.edit().putString("link", gthy2hju59uj).apply()
//                    startActivity(yh5yh9h55hy)
//                    activity?.finish()
//                } else {
//                    startActivity(gt2hy5hy9y)
//                    activity?.finish()
//                }
//        }
//    }

    private fun th5yh95y5hy5hy(frgtgtgttg: String) {
        OneSignal.setExternalUserId(
            frgtgtgttg,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {

                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val yhjujuujuj = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $yhjujuujuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val fgtbghnhhn =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $fgtbghnhhn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val bhyjukikiki = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $bhyjukikiki"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }
}