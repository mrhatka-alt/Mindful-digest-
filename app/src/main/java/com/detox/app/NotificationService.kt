package com.detox.app

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotificationService : NotificationListenerService() {

    // ज्या ॲप्सचे नोटिफिकेशन्स रोखायचे आहेत त्यांची यादी (packages)
    private val blockedApps = listOf(
        "com.instagram.android",      // Instagram
        "com.google.android.youtube",   // YouTube
        "com.whatsapp",                 // WhatsApp
        "com.snapchat.android"          // Snapchat
    )

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        val packageName = sbn?.packageName ?: return

        // जर नोटिफिकेशन वरील लिस्टेड ॲप्सपैकी असेल, तर ते स्क्रीनवरून लगेच काढून टाकणे
        if (blockedApps.contains(packageName)) {
            cancelNotification(sbn.key) // हे नोटिफिकेशन स्क्रीनवरून घालवते
            Log.d("DigitalDetox", "Notification blocked from: $packageName")
        }
    }
}
