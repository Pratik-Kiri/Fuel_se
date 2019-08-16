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

public class Afterreg_tin extends AppCompatActivity {

    ProgressBar progressBar;
    Button next0,pre0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterreg_tin);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        progressBar.setProgressTintList(ColorStateList.valueOf(Color.GREEN));

        next0=(Button)findViewById(R.id.next99);
        pre0=(Button)findViewById(R.id.pre99);

        pre0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(),AfterDealer.class);
                startActivity(ii);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        next0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii1=new Intent(getApplicationContext(),Aftertin_Bussiness_phone_number.class);
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
