package com.example.loultimoennoticiascolombia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loultimoennoticiascolombia.databinding.ActivityDeporteNacionalBinding
import com.example.loultimoennoticiascolombia.databinding.ActivityFarandulaNacionalBinding
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class DeporteNacionalActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    private lateinit var binding: ActivityDeporteNacionalBinding

    private var mInterstitialAd: InterstitialAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeporteNacionalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
        loadInterAd()
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://staticprd.minuto30.com/wp-content/uploads/2017/06/cabezote_deporte7.jpg"))
        list.add(CarouselItem("https://cloudfront-us-east-1.images.arcpublishing.com/semana/BCH7TYVZGJHSRBGL7YLMY5WWUE.jpg"))
        list.add(CarouselItem("https://i.ytimg.com/vi/j2PAPgcA-a0/maxresdefault.jpg"))
        list.add(CarouselItem("https://cloudfront-us-east-1.images.arcpublishing.com/semana/NVWDXDHCMFHVHPSRC66M5FQCSM.jpg"))
        list.add(CarouselItem("https://www.aiedi.org/wp-content/uploads/2021/09/pagina-14-nota-1-84.jpg"))
        list.add(CarouselItem("https://www.lahoradelfpc.com/wp-content/uploads/2019/06/Coldeportes.jpg"))
        list.add(CarouselItem("https://caliescribe.com/sites/default/files/EASGBDFB.jpg"))
        list.add(CarouselItem("https://www.cali24horas.com/wp-content/uploads/2021/12/seleccion-colombia-640x375.jpg"))
        list.add(CarouselItem("https://90minutos.co/wp-content/uploads/2022/04/america-no-pudo-y-cayo-ante-atletico-nacional-en-el-clasico-de-colombia-10-04-2022.jpg"))

        carousel.addData(list)

        val buttonElTiempo: Button = findViewById(R.id.buttonElTiempo)
        buttonElTiempo.setOnClickListener{

            addsGoogle()
        }

        val buttonElEspectador: Button = findViewById(R.id.buttonElEspectador)
        buttonElEspectador.setOnClickListener{

            addGoogle()
        }

        val buttonCanal1: Button = findViewById(R.id.buttonCanal1)
        buttonCanal1.setOnClickListener{

            AddGoogle()
        }

        val buttonElHeraldo: Button = findViewById(R.id.buttonElHeraldo)
        buttonElHeraldo.setOnClickListener{

            AddGoogleAdmob()
        }

        val buttonSportCaracol: Button = findViewById(R.id.buttonCaracol)
        buttonSportCaracol.setOnClickListener{

            AddGoogleadmob()
        }

        val buttonElPais: Button = findViewById(R.id.buttonElPais)
        buttonElPais.setOnClickListener{

            addGoogleadmob()
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewElPais4_Activity::class.java)
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

            val intent = Intent(this, WebViewElPais4_Activity::class.java)
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewSportCaracol4_Activity::class.java)
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

            val intent = Intent(this, WebViewSportCaracol4_Activity::class.java)
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewElHeraldo4_Activity::class.java)
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

            val intent = Intent(this, WebViewElHeraldo4_Activity::class.java)
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewCanalUno4_Activity::class.java)
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

            val intent = Intent(this, WebViewCanalUno4_Activity::class.java)
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewElEspectador4_Activity::class.java)
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

            val intent = Intent(this, WebViewElEspectador4_Activity::class.java)
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
                    val intent = Intent(this@DeporteNacionalActivity, WebViewElTiempo4_Activity::class.java)
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

            val intent = Intent(this, WebViewElTiempo4_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)

    }
}