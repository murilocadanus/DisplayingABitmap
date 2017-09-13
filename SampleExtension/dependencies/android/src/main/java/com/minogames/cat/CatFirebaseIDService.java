package com.minogames.cat;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mino on 2017-09-11.
 */

public class CatFirebaseIDService extends FirebaseInstanceIdService
{
    private static final String TAG = "CAT";

    @Override
    public void onTokenRefresh()
    {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "-----------------------------------------------------");
        Log.d(TAG, "-------- Refreshed token: " + refreshedToken + " ----");
        Log.d(TAG, "-----------------------------------------------------");

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }
}
