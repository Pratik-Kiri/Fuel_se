package com.pratik.fuel_se;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private int sleep_timer=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            Logo1 splash=new Logo1();
            splash.start();
    }

    private class Logo1 extends Thread{
        public void run(){
            try{
                sleep(1000*sleep_timer);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            Intent intent=new Intent(getApplicationContext(),Screen1.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            SplashScreen.this.finish();
        }

    }
}
