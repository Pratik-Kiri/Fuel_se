package com.pratik.fuel_se;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AfterPhonenum extends AppCompatActivity {

    String enterdnumber;
    TextView phonenumber;
    Button changenum;
    Button verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_phonenum);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        phonenumber=(TextView) findViewById(R.id.phonenumber);
        changenum=(Button)findViewById(R.id.changenum);
        verify=(Button)findViewById(R.id.verify);

            Intent intent1=getIntent();
        enterdnumber=intent1.getStringExtra("phone1");
        phonenumber.setText("+91 "+enterdnumber);

        changenum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11=new Intent(getApplicationContext(),Screen4.class);
                startActivity(i11);

            }
        });

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i22=new Intent(getApplicationContext(),After_OTP.class);
                startActivity(i22);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
