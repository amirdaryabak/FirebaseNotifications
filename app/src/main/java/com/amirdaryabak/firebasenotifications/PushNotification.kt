package com.amirdaryabak.firebasenotifications

data class PushNotification(
    val data: NotificationData,
    val to: String
)