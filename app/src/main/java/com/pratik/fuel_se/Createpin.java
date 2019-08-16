package com.pratik.fuel_se;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Createpin extends AppCompatActivity {

    TextView skip;
    EditText editText;
    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,backsapce,numnext;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpin);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        skip=(TextView) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               opencompleted();
            }
        });

        num0=(Button)findViewById(R.id.num0);
        num1=(Button)findViewById(R.id.num1);
        num2=(Button)findViewById(R.id.num2);
        num3=(Button)findViewById(R.id.num3);
        num4=(Button)findViewById(R.id.num4);
        num5=(Button)findViewById(R.id.num5);
        num6=(Button)findViewById(R.id.num6);
        num7=(Button)findViewById(R.id.num7);
        num8=(Button)findViewById(R.id.num8);
        num9=(Button)findViewById(R.id.num9);
        backsapce=(Button)findViewById(R.id.backspace1);
        numnext=(Button)findViewById(R.id.numnext);



        editText=(EditText)findViewById(R.id.editText);
        disableSoftInputFromAppearing(editText);


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");

            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
      numnext.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              opencompleted();

          }
      });

      backsapce.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

             editText.setText("");
              }


      });


    }
    public static void disableSoftInputFromAppearing(EditText editText) {

            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);


    }

    public void opencompleted()
    {
        Intent q=new Intent(getApplicationContext(),Reg_Completed.class);
        startActivity(q);
    }
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
