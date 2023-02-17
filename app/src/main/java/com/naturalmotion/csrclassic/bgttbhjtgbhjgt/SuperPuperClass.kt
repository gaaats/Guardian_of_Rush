package com.naturalmotion.csrclassic.bgttbhjtgbhjgt

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.naturalmotion.csrclassic.gjigthgthgthugt.ghyhyhyju
import com.naturalmotion.csrclassic.gjigthgthgthugt.gtjgtigtjgtijigtjigtj
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class SuperPuperClass : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("3d5632be-7872-44f3-a272-e87f5c7b3ab2")
        MyTracker.initTracker("28067169142238500709", this)

        val yhyjuuujuj = MyTracker.getTrackerConfig()
        yhyjuuujuj.isTrackingLaunchEnabled = true
        val nhnhjukik = MyTracker.getInstanceId(this)
        val jujikikikiki = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        jujikikikiki.edit().putString("instId", nhnhjukik).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@SuperPuperClass)
            modules(
                listOf(
                    ghyhyhyju, gtjgtigtjgtijigtjigtj
                )
            )
        }
    }
}