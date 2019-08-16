package com.pratik.fuel_se;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Aftertin_Bussiness_phone_number extends AppCompatActivity {

    ProgressBar progressBar;
    Button next2,pre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftertin__bussiness_phone_number);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        progressBar=(ProgressBar)findViewById(R.id.progressBar1);

        progressBar.setProgressTintList(ColorStateList.valueOf(Color.GREEN));

        next2=(Button)findViewById(R.id.next2);
        pre2=(Button)findViewById(R.id.pre2);

        pre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(getApplicationContext(),Afterreg_tin.class);
                startActivity(iii);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii1=new Intent(getApplicationContext(),After_business_phone_location.class);
                startActivity(ii1);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });


    }


    void Backpress(){
        Intent back=new Intent(getApplicationContext(),Screen1.class);
        startActivity(back);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


}
