package com.naturalmotion.csrclassic.goktijtigt


import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.naturalmotion.csrclassic.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Jjgtjgtjgt(
    var vfvfvf: Context,
    var task1111: IJjfjjgtigtjgt,
    val jujkiikik62: Int,
    val hyhhyhyhy: List<Int>
) : View(vfvfvf) {

    private var huju95j95uj59uj = 0
    private var gtgttg = Paint()
    private var hy2hy62yh6hy59hy59 = 0
    private var jikoloo = 0
    private var gbgyhyyju = 8
    private var ffggtgttg: Paint? = null
    private var hy5hy59hy59h5: Paint? = null
    private var vjgtjgitjgtjitg: Paint? = null

    private var nnnnnn = 3

    var ssssssssssys = System.currentTimeMillis()
    private var dfrfrrrr7 = 0
    private var tltltltlt = ""

    private var hy5hy59yh559hy = 0

    private var hy5hy9hy595hy = ArrayList<HashMap<String, Any>>()
    private var frtgyhhyhy = ArrayList<HashMap<String, Any>>()

    private var gthy5hy5hy5hy95hy = 0


    var hyhuj59u95uj5uj9 = hyhhyhyhy.random()

    init {
        ffggtgttg = Paint()
        gtgttg.color = Color.GREEN
        hy5hy59hy59h5 = Paint()
        vjgtjgitjgtjitg = Paint()
        vjgtjgitjgtjitg!!.textSize = 100f
        vjgtjgitjgtjitg!!.alpha = 190
        vjgtjgitjgtjitg!!.color = Color.WHITE
    }

    override fun onDraw(canvas: Canvas?) {
        canvas!!.drawText(
            tltltltlt,
            gthy5hy5hy5hy95hy / 2f - 220f,
            dfrfrrrr7 / 2f,
            vjgtjgitjgtjitg!!
        )


        super.onDraw(canvas)

        gthy5hy5hy5hy95hy = this@Jjgtjgtjgt.measuredWidth
        dfrfrrrr7 = this@Jjgtjgtjgt.measuredHeight

        var ddddiifrork = System.currentTimeMillis() - ssssssssssys

        if (huju95j95uj59uj % 700 < 10 + gbgyhyyju) {
            val maampamamapam = HashMap<String, Any>()

            maampamamapam["lane"] = (0..2).random()
            maampamamapam["startTime"] = huju95j95uj59uj
            hy5hy9hy595hy.add(maampamamapam)
        }
        huju95j95uj59uj = huju95j95uj59uj + 10 + gbgyhyyju
        val hyhhyhyhyhy = gthy5hy5hy5hy95hy / 5
        val bgbhnhnhhn = hyhhyhyhyhy + 10
        ffggtgttg!!.style = Paint.Style.FILL

        val drawableeee = resources.getDrawable(jujkiikik62, null)

        drawableeee.setBounds(
            hy2hy62yh6hy59hy59 * gthy5hy5hy5hy95hy / 3 + gthy5hy5hy5hy95hy / 15 + 5,
            dfrfrrrr7 - 120 - bgbhnhnhhn,
            hy2hy62yh6hy59hy59 * gthy5hy5hy5hy95hy / 3 + gthy5hy5hy5hy95hy / 15 + hyhhyhyhyhy - 25+50+60,
            dfrfrrrr7 - 20
        )
        drawableeee.draw(canvas!!)
        ffggtgttg!!.color = Color.GREEN
        var ccccccccccsoreee = 0

        edferfrrrfrfr(canvas)


        if (ddddiifrork >= 5000) {
            hyhuj59u95uj5uj9 = hyhhyhyhy.random()
            ssssssssssys = System.currentTimeMillis()
            gbgyhyyju = gbgyhyyju + 1 + Math.abs(jikoloo / 8)

            val mbmbmbmbmb = HashMap<String, Any>()
            mbmbmbmbmb["lane"] = (0..2).random()
            mbmbmbmbmb["startTime"] = huju95j95uj59uj
            frtgyhhyhy.add(mbmbmbmbmb)
        }


        for (i in hy5hy9hy595hy.indices) {
            try {
                val edfrgfrgtgt = hy5hy9hy595hy[i]["lane"] as Int * gthy5hy5hy5hy95hy / 3 + gthy5hy5hy5hy95hy / 15
                var frgttt = huju95j95uj59uj - hy5hy9hy595hy[i]["startTime"] as Int


                val ddedfrkPodfrk = resources.getDrawable(hyhuj59u95uj5uj9, null)

                ddedfrkPodfrk.setBounds(
                    edfrgfrgtgt + 25,
                    frgttt - bgbhnhnhhn,
                    edfrgfrgtgt + hyhhyhyhyhy,
                    frgttt
                )
                ddedfrkPodfrk.draw(canvas)
                if (hy5hy9hy595hy[i]["lane"] as Int == hy2hy62yh6hy59hy59) {
                    if (frgttt > dfrfrrrr7 - 2 - bgbhnhnhhn && frgttt < dfrfrrrr7 - 2) {
                        Log.d("life", "life is ${nnnnnn}")

                        when (nnnnnn) {
                            0 -> {
                                hyhjiyhjihyji()
                            }
                            1 -> {
                                hyhjiyhjihyji()
                            }
                            2 -> {
                                tltltltlt = "1 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                gktggtjigtjigtjgtji()
                            }
                            3 -> {
                                gtgttg.color = Color.YELLOW
                                tltltltlt = "2 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                vjgtjgitjgtjitg!!.alpha = 200
                                nnnnnn--
                                hy5hy9hy595hy.clear()
                            }
                        }
                    }
                    if (frgttt > dfrfrrrr7 + bgbhnhnhhn) {
                        hy5hy9hy595hy.removeAt(i)
                        fhrgtggttggt()

                        if (jikoloo > ccccccccccsoreee) {
                            ccccccccccsoreee = jikoloo
                        }
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        ffggtgttg!!.color = Color.WHITE
        ffggtgttg!!.textSize = 40f
        canvas.drawText("Score: $jikoloo", 80f, dfrfrrrr7 - 40f, ffggtgttg!!)
        canvas.drawText("Speed: $gbgyhyyju", 380f, dfrfrrrr7 - 40f, ffggtgttg!!)
        canvas!!.drawRect(
            (gthy5hy5hy5hy95hy - 200).toFloat(), dfrfrrrr7 - 40f,
            (gthy5hy5hy5hy95hy - 200 + 60 * nnnnnn).toFloat(), dfrfrrrr7 - 80f, gtgttg
        )
        invalidate()
    }

    private fun fhrgtggttggt() {
        jikoloo++
        hy5hy59yh559hy++
    }

    private fun gktggtjigtjigtjgtji() {
        gtgttg.color = Color.RED
        nnnnnn--
        hy5hy9hy595hy.clear()
    }

    private fun hyhjiyhjihyji() {
        task1111.clclcllcgimi(jikoloo)
    }

    private fun edferfrrrfrfr(canvas: Canvas): Boolean {
        val ggggggggghj = gthy5hy5hy5hy95hy / 5
        val kokokok = ggggggggghj + 10
        hy5hy59hy59h5!!.style = Paint.Style.FILL

        for (i in frtgyhhyhy.indices) {

            val bbobobofdgjgg = frtgyhhyhy[i]["lane"] as Int * gthy5hy5hy5hy95hy / 3 + gthy5hy5hy5hy95hy / 15
            var bbybbyyb = huju95j95uj59uj - frtgyhhyhy[i]["startTime"] as Int

            val bombon = resources.getDrawable(R.drawable.el1, null)
            bombon.setBounds(bbobobofdgjgg + 25, bbybbyyb - kokokok, bbobobofdgjgg + kokokok, bbybbyyb)
            bombon.draw(canvas)

            if (frtgyhhyhy[i]["lane"] as Int == hy2hy62yh6hy59hy59) {
                if (bbybbyyb > dfrfrrrr7 - 2 - kokokok && bbybbyyb < dfrfrrrr7 - 2) {
                    when (nnnnnn) {
                        1 -> {
                            nnnnnn++
                            tltltltlt = "2 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            gtgttg.color = Color.YELLOW
                            frtgyhhyhy.clear()
                            return true
                        }
                        2 -> {
                            nnnnnn++
                            tltltltlt = "3 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            gtgttg.color = Color.GREEN
                            frtgyhhyhy.clear()
                            return true
                        }
                        3 -> {
                            tltltltlt = "MAX health"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            return true
                        }
                    }
                }
            }
        }
        return true
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        try {
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x1 = event.x
                    if (x1 < gthy5hy5hy5hy95hy / 2) {
                        if (hy2hy62yh6hy59hy59 > 0) {
                            hy2hy62yh6hy59hy59--
                        }
                    }
                    if (x1 > gthy5hy5hy5hy95hy / 2) {
                        if (hy2hy62yh6hy59hy59 < 2) {
                            hy2hy62yh6hy59hy59++
                        }
                    }
                    invalidate()
                }
                MotionEvent.ACTION_UP -> {

                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return true
    }

    private fun eeeeeeeeeeeeeri() {
        Toast.makeText(
            vfvfvf,
            "Error, error, error...",
            Toast.LENGTH_SHORT
        ).show()
    }
}

