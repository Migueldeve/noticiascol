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
import com.noticias.migueldev.databinding.ActivityFarandulaNacionalBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class FarandulaNacionalActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    private lateinit var binding: ActivityFarandulaNacionalBinding

    private var mInterstitialAd: InterstitialAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarandulaNacionalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
        loadInterAd()
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://i.ytimg.com/vi/z0dSOYGVLxQ/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLAxDzq-sfh7tKD7s2KIQCJ6DaOEog"))
        list.add(CarouselItem("https://imagenes.canalrcn.com/lomaslike/mascotas-de-los%20famosos.jpeg"))
        list.add(CarouselItem("https://uploads.vibra.co/1/2020/06/papas-famosos-mas-guapos-de-la-farandula-colombiana.jpg"))
        list.add(CarouselItem("https://enteratecali.net/wp-content/uploads/2022/03/Confirmado-cual-es-el-sexo-y-nombre-del-bebe-de-Greeicy-Rendon-y-Mike-Bahia.jpg"))
        list.add(CarouselItem("https://cloudfront-us-east-1.images.arcpublishing.com/infobae/IX6VL77KPFGKHLJEM7PPQPN3UY.jpg"))
        list.add(CarouselItem("https://i0.wp.com/nostalgiaradio.fm/wp-content/uploads/2022/05/farandula.jpg?ssl=1"))
        list.add(CarouselItem("https://www.momento24.co/wp-content/uploads/2022/05/Portada-mamitas.jpg"))

        carousel.addData(list)

        val buttonElUniversal: Button = findViewById(R.id.buttonElUniversal)
        buttonElUniversal.setOnClickListener{

            addsGoogle()
        }

        val buttonLaMega: Button = findViewById(R.id.buttonLaMega)
        buttonLaMega.setOnClickListener{

            addGoogle()
        }

        val buttonAlertaPaisa: Button = findViewById(R.id.buttonAlertaPaisa)
        buttonAlertaPaisa.setOnClickListener{

            AddGoogle()
        }

        val buttonAlertaBogota: Button = findViewById(R.id.buttonAlertaBogota)
        buttonAlertaBogota.setOnClickListener{

            AddGoogleAdmob()
        }

        val buttonLaKalle: Button = findViewById(R.id.buttonLaKalle)
        buttonLaKalle.setOnClickListener{

            AddGoogleadmob()
        }

        val buttonWRadio: Button = findViewById(R.id.buttonWRadio)
        buttonWRadio.setOnClickListener{

            addGoogleadmob()
        }

        val buttonElColombiano: Button = findViewById(R.id.buttonElColombiano)
        buttonElColombiano.setOnClickListener{

            addGoogleAdmob()
        }

        val buttonElTiempo: Button = findViewById(R.id.buttonElTiempo)
        buttonElTiempo.setOnClickListener{

            addgoogleAdmob()
        }

        val buttonColombiaCom: Button = findViewById(R.id.buttonColombia_com)
        buttonColombiaCom.setOnClickListener{

            addgoogleAdmOb()
        }

    }

    private fun addgoogleAdmOb() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewColombia_Com3_Activity::class.java)
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

            val intent = Intent(this, WebViewColombia_Com3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun addgoogleAdmob() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewElTiempo3_Activity::class.java)
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

            val intent = Intent(this, WebViewElTiempo3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun addGoogleAdmob() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewElColombiano3_Activity::class.java)
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

            val intent = Intent(this, WebViewElColombiano3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun addGoogleadmob() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewWRadio3_Activity::class.java)
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

            val intent = Intent(this, WebViewWRadio3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun AddGoogleadmob() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewLaKalle3_Activity::class.java)
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

            val intent = Intent(this, WebViewLaKalle3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun AddGoogleAdmob() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewAlertaBogota3_Activity::class.java)
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

            val intent = Intent(this, WebViewAlertaBogota3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun AddGoogle() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewAlertaPaisa3_Activity::class.java)
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

            val intent = Intent(this, WebViewAlertaPaisa3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun addGoogle() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewLaMega3_Activity::class.java)
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

            val intent = Intent(this, WebViewLaMega3_Activity::class.java)
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

    private fun addsGoogle() {

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
                    val intent = Intent(this@FarandulaNacionalActivity, WebViewElUniversal3_Activity::class.java)
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

            val intent = Intent(this, WebViewElUniversal3_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)

    }
}