package com.naturalmotion.csrclassic

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class VebBrovvvissssrerActivity2 : AppCompatActivity() {
    lateinit var gth2hyhyhy5hy9hy: BTwoLib
    val gtg2tg5tg9gt5: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gth2hyhyhy5hy9hy = BTwoLib(this@VebBrovvvissssrerActivity2)
        setContentView(gth2hyhyhy5hy9hy)
        gth2hyhyhy5hy9hy.profiter(gthyhy59hy595())
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            gth2hyhyhy5hy9hy.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (!gth2hyhyhy5hy9hy.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }

    private fun gthyhy59hy595(): String {
        val gthy2y2hy62hy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val h2y2h59yhh59 = gtg2tg5tg9gt5.getString("link", null)
        gthy2y2hy62hy.edit().putString("SAVED_URL", h2y2h59yhh59).apply()
        return gthy2y2hy62hy.getString("SAVED_URL", h2y2h59yhh59).toString()
    }
}