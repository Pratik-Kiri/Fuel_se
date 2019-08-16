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
import android.widget.Toast;

public class Afterlocation_Pancard_Aadhar extends AppCompatActivity {

    ProgressBar progressBar;
    Button next99,pre99;
    Button b1,b2,b3,b4,b5;

    int count=0;
    int temp1=0,temp2=0,temp3=0,temp4=0,temp5=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlocation__pancard__aadhar);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        progressBar=(ProgressBar)findViewById(R.id.pgb2);

        progressBar.setProgressTintList(ColorStateList.valueOf(Color.GREEN));

        next99=(Button)findViewById(R.id.next99);
        pre99=(Button)findViewById(R.id.pre99);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);


        if(temp1==1)
        {
            b1.setText("Uploaded");
        }
        if(temp2==1)
        {
            b2.setText("Uploaded");
        }
        if(temp3==1)
        {
            b3.setText("Uploaded");
        }
        if(temp4==1)
        {
            b4.setText("Uploaded");
        }
        if(temp5==1)
        {
            b5.setText("Uploaded");
        }


        pre99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),After_business_phone_location.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),Pancard.class);
                startActivity(in);
                count++;
               temp1=1;

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a=new Intent(getApplicationContext(),Adhar_Card.class);
                startActivity(a);
                count++;
              temp2=1;

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b=new Intent(getApplicationContext(),Tin_Number.class);
                startActivity(b);
                count++;
               temp3=1;

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c = new Intent(getApplicationContext(), Business_logo.class);
                startActivity(c);
                count++;
               temp4=1;

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent d=new Intent(getApplicationContext(),Business_location.class);
                startActivity(d);
                count++;
               temp5=1;
            }
        });

        next99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>=2)
                {
                    Intent e=new Intent(getApplicationContext(),Createpin.class);
                    startActivity(e);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Upload at least two documents!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


}
