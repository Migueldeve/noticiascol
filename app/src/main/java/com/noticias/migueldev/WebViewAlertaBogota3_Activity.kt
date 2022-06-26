package com.noticias.migueldev

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.gms.ads.AdRequest
import com.noticias.migueldev.databinding.ActivityWebView3AlertaBogotaBinding
import kotlinx.android.synthetic.main.activity_web_view_1caracol.*

class WebViewAlertaBogota3_Activity : AppCompatActivity() {

    //Private

    private val BASE_URL = "https://www.alertabogota.com/noticias/chismes-y-farandula"

    private lateinit var binding: ActivityWebView3AlertaBogotaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebView3AlertaBogotaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()

        //REFRESH

        SwipeLayout.setOnRefreshListener {
            webvieww.reload()
        }

        //WebView

        webvieww.webChromeClient = object : WebChromeClient(){

        }

        webvieww.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

                SwipeLayout.isRefreshing = true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)

                SwipeLayout.isRefreshing = false
            }

        }

        val settings = webvieww.settings
        settings.javaScriptEnabled = true

        webvieww.loadUrl(BASE_URL)
    }

    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)
    }

    override fun onBackPressed() {
        if (webvieww.canGoBack()) {
            webvieww.goBack()
        } else {
            super.onBackPressed()
        }
    }

}