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
import com.noticias.migueldev.databinding.ActivityPoliticaYGeneralBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class PoliticayGeneralActivity : AppCompatActivity() {

    private var mInterstitialAd: InterstitialAd? = null

    private lateinit var binding: ActivityPoliticaYGeneralBinding

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPoliticaYGeneralBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        loadInterAd()
        initLoadAds()

        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/presidencia%20co.png?alt=media&token=3a4e67c2-3d2e-47af-9551-bf00286780e5"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/png_20220531_010446_0000.png?alt=media&token=ecdb2351-1cb3-49e2-918a-001759324614"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/5WEBFNNIEFGD7FBA3S3DAGB2FM.jpg?alt=media&token=8616f1f8-374d-4a53-a6e4-c57911f084bc"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/1653976843267.png?alt=media&token=74367150-ba71-4cf9-947b-41faf8d8f9b8"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/HAT2ZNZRTVAVJKTLA3WNBOWO7M.jpg?alt=media&token=a77eddf0-95ca-4a19-b75c-39f9a09aefd0"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/62938638cc45e.jpeg?alt=media&token=0b134bb4-b6fa-48fb-b70a-58e65ce4e597"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/Rodolfo%20Hern%C3%A1ndez%20votando%20en%20presidenciales.jpg?alt=media&token=198e4ef4-08b8-494e-a177-91e7067f55c9"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/WAWDN3S4CNGMPH4UNISZVJOI74.jpg?alt=media&token=73ce2d66-2af6-48df-b54c-e6085dd72fe2"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/1_20220531_215308_0000.png?alt=media&token=aa1f87a7-9399-44f6-991b-34d024106db3"))
        list.add(CarouselItem("https://firebasestorage.googleapis.com/v0/b/noticias-colombia-b39b6.appspot.com/o/2_20220531_215308_0001.png?alt=media&token=af24d94f-d707-4add-a557-5053b09a91f3"))

        carousel.addData(list)

        val buttonLaCronicaDelQuindio: Button = findViewById(R.id.buttonLaCronicaDelQuindi)
        buttonLaCronicaDelQuindio.setOnClickListener{

            showInterAddAdmob()

        }

        val buttonExtra: Button = findViewById(R.id.buttonEXTRA)
        buttonExtra.setOnClickListener{

            showInterAddsAdmobGOOGLE()

        }

        val buttonADN: Button = findViewById(R.id.buttonADN)
        buttonADN.setOnClickListener{

            showInterAddsAdmob()

        }

        val buttonCaracol: Button = findViewById(R.id.buttonCaracol)
        buttonCaracol.setOnClickListener{

            showInterAd()

        }

        val buttonElTiempo: Button = findViewById(R.id.buttonElTiempo)
        buttonElTiempo.setOnClickListener{

            showInterAdd()

        }

        val buttonEspectador: Button = findViewById(R.id.buttonEspectador)
        buttonEspectador.setOnClickListener{

            showInterAdds()

        }

        val buttonPublimetro: Button = findViewById(R.id.buttonPubliMetro)
        buttonPublimetro.setOnClickListener{

            showInterAddsGoogle()

        }

        val buttonRcn: Button = findViewById(R.id.buttonRcn)
        buttonRcn.setOnClickListener{

            showInterAddsGoogleAdmob()

        }

        val buttonElHeraldo: Button = findViewById(R.id.buttonElHeraldo)
        buttonElHeraldo.setOnClickListener{

            addGoogleAdmob()

        }

        val buttonLaRed: Button = findViewById(R.id.buttonLaRed)
        buttonLaRed.setOnClickListener{

            addsGoogleAdmob()
        }

        val buttonElColombiano: Button = findViewById(R.id.buttonElColombiano)
        buttonElColombiano.setOnClickListener{

            adGoogleAdmob()
        }

        val buttonQhubo: Button = findViewById(R.id.buttonQhubo)
        buttonQhubo.setOnClickListener{

            AddGoogle()
        }

        val buttonElPais: Button = findViewById(R.id.buttonElPais)
        buttonElPais.setOnClickListener{

            AddsGoogle()
        }

    }

    private fun AddsGoogle() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewElPais1_Activity::class.java)
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

            val intent = Intent(this, WebViewElPais1_Activity::class.java)
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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewQhubo1_Activity::class.java)
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

            val intent = Intent(this, WebViewQhubo1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun adGoogleAdmob() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewElColombiano1_Activity::class.java)
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

            val intent = Intent(this, WebViewElColombiano1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun addsGoogleAdmob() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewLaRed_Activity::class.java)
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

            val intent = Intent(this, WebViewLaRed_Activity::class.java)
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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewElHeraldo1_Activity::class.java)
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

            val intent = Intent(this, WebViewElHeraldo1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAddAdmob() {
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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewLaCronicaDelQuindio1_Activity::class.java)
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

            val intent = Intent(this, WebViewLaCronicaDelQuindio1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAddsAdmobGOOGLE() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewExtra1_Activity::class.java)
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

            val intent = Intent(this, WebViewExtra1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAddsAdmob() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewADN1_Activity::class.java)
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

            val intent = Intent(this, WebViewADN1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)
    }

    private fun showInterAddsGoogleAdmob() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewRcn1_Activity::class.java)
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

            val intent = Intent(this, WebViewRcn1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAddsGoogle() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewPublimetro1_Activity::class.java)
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

            val intent = Intent(this, WebViewPublimetro1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAdds() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewElEspectador1_Activity::class.java)
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

            val intent = Intent(this, WebViewElEspectador1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAdd() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewElTiempo1_Activity::class.java)
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

            val intent = Intent(this, WebViewElTiempo1_Activity::class.java)
            startActivity(intent)

        }

    }

    private fun showInterAd() {

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
                    val intent = Intent(this@PoliticayGeneralActivity, WebViewCaracol1_Activity::class.java)
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

            val intent = Intent(this, WebViewCaracol1_Activity::class.java)
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

}