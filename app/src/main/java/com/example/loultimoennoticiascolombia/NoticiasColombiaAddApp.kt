package com.example.loultimoennoticiascolombia

import android.app.Application
import com.google.android.gms.ads.MobileAds

class NoticiasColombiaAddApp:Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}