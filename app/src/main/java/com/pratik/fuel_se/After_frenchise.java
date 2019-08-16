package com.pratik.fuel_se;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class After_frenchise extends AppCompatActivity {

    ProgressBar progressBar;
    Button pre,next1;
    EditText dname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_frenchise);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        progressBar.setProgressTintList(ColorStateList.valueOf(Color.GREEN));

        pre=(Button)findViewById(R.id.pre);
        next1=(Button)findViewById(R.id.next1);


        dname=(EditText)findViewById(R.id.dname);


        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),After_OTP.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              opennext();
            //  senddname();
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

    public void opennext()
    {
        Intent intent02=new Intent(getApplicationContext(),AfterDealer.class);
        startActivity(intent02);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }
  /*  public void senddname()
    {



    }

    */



}
