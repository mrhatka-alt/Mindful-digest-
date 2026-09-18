package com.detox.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // मुख्य लेआउट तयार करणे (उभे - Vertical)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(60, 60, 60, 60)
            setBackgroundColor(android.graphics.Color.WHITE)
        }

        // माहिती देणारा मजकूर (Text)
        val textView = TextView(this).apply {
            text = "डिजिटल डिटॉक्स सक्रिय करण्यासाठी,\nकृपया खालील बटण दाबून 'Notification Access' चालू करा."
            textSize = 20f
            setTextColor(android.graphics.Color.BLACK)
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 60)
        }

        // परमिशन चालू करण्याचे बटण (Button)
        val button = Button(this).apply {
            text = "परमिशन चालू करा (Enable Access)"
            textSize = 16f
            setOnClickListener {
                // हे बटण दाबल्यावर फोनच्या सेटिंग्समधील परमिशन पेज उघडेल
                startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))
            }
        }

        // सर्व गोष्टी लेआउटमध्ये जोडणे
        layout.addView(textView)
        layout.addView(button)

        // लेआउट स्क्रीनवर दाखवणे
        setContentView(layout)
    }
}
