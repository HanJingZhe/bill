package com.qtgm.bill.ui

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.qtgm.bill.R
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val settings = webView.settings
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.javaScriptEnabled = true
//        settings.useWideViewPort = true
//        settings.loadWithOverviewMode = true
        settings.setSupportZoom(true)
        settings.builtInZoomControls = true
        settings.displayZoomControls = false


        webView.webViewClient = object : WebViewClient() {
            /* override fun shouldInterceptRequest(
                 view: WebView?,
                 request: WebResourceRequest?
             ): WebResourceResponse? {
                 request?.let {
                     view?.loadUrl(request.url.toString())
                 }
                 return super.shouldInterceptRequest(view, request)
             }*/

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                return false
            }
        }

        webView.loadUrl("https://www.baidu.com/")

    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }

}