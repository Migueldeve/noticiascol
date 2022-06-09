package com.example.loultimoennoticiascolombia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loultimoennoticiascolombia.databinding.ActivityEconomiaNacionalBinding
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class EconomiaNacionalActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    private lateinit var binding: ActivityEconomiaNacionalBinding

    private var mInterstitialAd: InterstitialAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEconomiaNacionalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
        loadInterAd()
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://img.lalr.co/cms/2022/01/11163652/globo_crecimiento_p9.jpg"))
        list.add(CarouselItem("https://www.valoraanalitik.com/wp-content/uploads/2020/06/Colombia-economia.jpg"))
        list.add(CarouselItem("https://www.bankmagazine.com.ar/wp-content/uploads/2021/03/colombia-pandemia.png"))
        list.add(CarouselItem("https://www.red-brands.com/wp-content/uploads/2019/05/Hacia-d%C3%B3nde-va-la-econom%C3%ADa-en-Colombia.jpg"))
        list.add(CarouselItem("https://i.ytimg.com/vi/pTUG34IUmYI/maxresdefault.jpg"))

        carousel.addData(list)

        val buttonRcnRadio: Button = findViewById(R.id.buttonRcnRadio)
        buttonRcnRadio.setOnClickListener{

            addsGoogle()
        }

        val buttonCaracolRadio: Button = findViewById(R.id.buttonCaracolRadio)
        buttonCaracolRadio.setOnClickListener{

            addGoogle()
        }

        val buttonElEspectador: Button = findViewById(R.id.buttonEspectador)
        buttonElEspectador.setOnClickListener{

            AddGoogle()
        }

        val buttonPublimetro: Button = findViewById(R.id.buttonPubliMetro)
        buttonPublimetro.setOnClickListener{

            AddGoogleAdmob()
        }

        val buttonElHeraldo: Button = findViewById(R.id.buttonElHeraldo)
        buttonElHeraldo.setOnClickListener{

            AddGoogleadmob()
        }

        val buttonElTiempo: Button = findViewById(R.id.buttonElTiempo)
        buttonElTiempo.setOnClickListener{

            addGoogleadmob()
        }

        val buttonPortafolio: Button = findViewById(R.id.buttonPortafolio)
        buttonPortafolio.setOnClickListener{

            addGoogleAdmob()
        }

        val buttonElColombiano: Button = findViewById(R.id.buttonELColombiano)
        buttonElColombiano.setOnClickListener{

            addgoogleAdmob()
        }

        val buttonElPilon: Button = findViewById(R.id.buttonElPilon)
        buttonElPilon.setOnClickListener{

            AddgoogleAdmob()
        }

        }

    private fun AddgoogleAdmob() {

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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewElPilon2_Activity::class.java)
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

            val intent = Intent(this, WebViewElPilon2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewElColombiano2_Activity::class.java)
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

            val intent = Intent(this, WebViewElColombiano2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewPortafolio2_Activity::class.java)
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

            val intent = Intent(this, WebViewPortafolio2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewElTiempo2_Activity::class.java)
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

            val intent = Intent(this, WebViewElTiempo2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewElHeraldo2_Activity::class.java)
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

            val intent = Intent(this, WebViewElHeraldo2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewPublimetro2_Activity::class.java)
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

            val intent = Intent(this, WebViewPublimetro2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewElEspectador2_Activity::class.java)
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

            val intent = Intent(this, WebViewElEspectador2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewCaracolRadio2_Activity::class.java)
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

            val intent = Intent(this, WebViewCaracolRadio2_Activity::class.java)
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
                    val intent = Intent(this@EconomiaNacionalActivity, WebViewRcnRadio2_Activity::class.java)
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

            val intent = Intent(this, WebViewRcnRadio2_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)

        }
    }
