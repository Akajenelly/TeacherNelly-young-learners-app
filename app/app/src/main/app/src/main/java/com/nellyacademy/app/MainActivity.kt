package com.nellyacademy.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccess = true

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://nellyyounglearnersapp.netlify.app")

        setContentView(webView)
    }

    override fun onBackPressed() {
        // Go back inside the website if possible
        val webView = findViewById<WebView>(android.R.id.content)
        
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
