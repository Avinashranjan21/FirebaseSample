package com.bugfreetechnology.firebasesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_sub_news,btn_unSub_news;
    public static final String FCM_TOPIC_NEWS = "NEWS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);
        String token = FirebaseInstanceId.getInstance().getToken();

        btn_sub_news = findViewById(R.id.btn_sub_news);
        btn_unSub_news = findViewById(R.id.btn_unSub_news);

        btn_sub_news.setOnClickListener(this);
        btn_unSub_news.setOnClickListener(this);

    }

    /*DEVICE 1 -> Class 8 --- 8
    DEVICE 2 -> Class 10 ---10--- notification
    DEVICE 3 -> Class 10 ---10--- notification
    DEVICE 4 -> Class 9 ---9 --- notification*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_sub_news:
                FirebaseMessaging.getInstance().subscribeToTopic(FCM_TOPIC_NEWS);
                break;
            case R.id.btn_unSub_news:
                FirebaseMessaging.getInstance().unsubscribeFromTopic(FCM_TOPIC_NEWS);
                break;
        }
    }
}
