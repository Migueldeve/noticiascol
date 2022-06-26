package com.noticias.migueldev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

import com.noticias.migueldev.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {

    private var mInterstitialAd: InterstitialAd? = null

    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
        loadInterAd()

        val buttonPoliticayGeneral: Button = findViewById(R.id.buttonPoliticayGeneral)
        buttonPoliticayGeneral.setOnClickListener{

            admobGoogle()
        }

        //hola
        val buttonEconomiaNacional: Button = findViewById(R.id.buttonEconomiaNacional)
        buttonEconomiaNacional.setOnClickListener{

            Admobgoogle()
        }

        val buttonFarandulaNacional: Button = findViewById(R.id.buttonFarandulaNacional)
        buttonFarandulaNacional.setOnClickListener{

            admobGoogleAdd()
        }

        val buttonDeporteNacional: Button = findViewById(R.id.buttonDeportesNacional)
        buttonDeporteNacional.setOnClickListener{

            admobGoogleAd()
        }
    }

    private fun admobGoogleAd() {

        if (mInterstitialAd != null){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                    val intent = Intent(this@CategoryActivity, DeporteNacionalActivity::class.java)
                    startActivity(intent)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }


            }

            mInterstitialAd?.show(this)

        }else{

            val intent = Intent(this, DeporteNacionalActivity::class.java)
            startActivity(intent)

        }

    }

    private fun admobGoogleAdd() {

        if (mInterstitialAd != null){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                    val intent = Intent(this@CategoryActivity, FarandulaNacionalActivity::class.java)
                    startActivity(intent)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }


            }

            mInterstitialAd?.show(this)

        }else{

            val intent = Intent(this, FarandulaNacionalActivity::class.java)
            startActivity(intent)

        }

    }

    private fun Admobgoogle() {

        if (mInterstitialAd != null){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                    val intent = Intent(this@CategoryActivity, EconomiaNacionalActivity::class.java)
                    startActivity(intent)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }


            }

            mInterstitialAd?.show(this)

        }else{

            val intent = Intent(this, EconomiaNacionalActivity::class.java)
            startActivity(intent)

        }

    }

    private fun admobGoogle() {

        if (mInterstitialAd != null){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                    val intent = Intent(this@CategoryActivity, PoliticayGeneralActivity::class.java)
                    startActivity(intent)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }


            }

            mInterstitialAd?.show(this)

        }else{

            val intent = Intent(this, PoliticayGeneralActivity::class.java)
            startActivity(intent)

        }

    }

    private fun loadInterAd() {

        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6713950183257774/8725739421", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)
    }
}