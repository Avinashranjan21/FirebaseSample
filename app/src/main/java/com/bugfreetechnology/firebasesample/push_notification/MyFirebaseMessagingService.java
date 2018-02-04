package com.bugfreetechnology.firebasesample.push_notification;


import android.util.Log;
import android.widget.Switch;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMessagingServ";



    // FCM message limit 4KB
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        boolean b = remoteMessage != null;
        Log.d(TAG, "onMessageReceived: "+remoteMessage.getNotification().getBody());



        /*
        1. breaking News
        sendBroadcast(BreakingNewsReciever)

        2. Sports News
         sendBroadcast(SportsNewsReciever)
        3. Politics News
        ...
        4. Bollywood News
        .....
        * */




    }
}
