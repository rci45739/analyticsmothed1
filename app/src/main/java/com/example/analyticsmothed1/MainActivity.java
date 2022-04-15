package com.example.analyticsmothed1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    FirebaseAnalytics analytics;
    @Override
    public void onResume(){
        super.onResume();
        Bundle params = new Bundle();
        //params.putString(FirebaseAnalytics.Param.SCREEN_NAME,"screenName);
        params.putString(FirebaseAnalytics.Param.SCREEN_CLASS,"MainActivity");
        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, params);

    }//屏幕追蹤

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analytics=FirebaseAnalytics.getInstance(this);

        Button b1=findViewById(R.id.button1);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);

        //點擊事件追中
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("測試按鈕1","測試按鈕1 button");
                analytics.logEvent("測試按鈕1button",bundle);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("測試按鈕2","測試按鈕2 button");
                analytics.logEvent("測試按鈕2button",bundle);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("測試按鈕3","測試按鈕3 button");
                analytics.logEvent("測試按鈕3button",bundle);

            }
        });



    }
}