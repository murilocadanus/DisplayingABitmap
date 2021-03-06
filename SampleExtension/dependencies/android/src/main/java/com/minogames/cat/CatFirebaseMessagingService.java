package com.minogames.cat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class CatFirebaseMessagingService extends FirebaseMessagingService
{
    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...

        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "***********************************************************");
        Log.d(TAG, "************************** From: " + remoteMessage.getFrom());
        Log.d(TAG, "***********************************************************");

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
            sendNotification(remoteMessage.getNotification().getBody());
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }

    /**
     * Handle time allotted to BroadcastReceivers.
     */
    private void handleNow() {
        Log.d(TAG, "Short lived task is done.");
    }

    private void sendNotification(String messageBody) {
        // Intent intent = new Intent(this, SampleExtension.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
        //         PendingIntent.FLAG_ONE_SHOT);

        // Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        // NotificationCompat.Builder notificationBuilder =
        //         new NotificationCompat.Builder(this)
        //                 .setSmallIcon(R.drawable.ic_notification)
        //                 .setContentTitle("Cat Game  ")
        //                 .setContentText(messageBody)
        //                 .setAutoCancel(true)
        //                 .setSound(defaultSoundUri)
        //                 .setContentIntent(pendingIntent);

        // NotificationManager notificationManager =
        //         (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }
}
