package com.pratik.fuel_se;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Adhar_Card extends AppCompatActivity {

    ImageView adhar;
    Button backbutton, camera, gallary;
    private static final int pic_id = 123;
    private static int IMG_RESULT = 1;
    String ImageDecode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhar__card);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        backbutton = (Button) findViewById(R.id.backbutton2);
        camera = (Button) findViewById(R.id.photo2);
        gallary = (Button) findViewById(R.id.gallery2);
        adhar = (ImageView) findViewById(R.id.adhar);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent camera_intent
                        = new Intent(MediaStore
                        .ACTION_IMAGE_CAPTURE);

                startActivityForResult(camera_intent, pic_id);
            }
        });

        //get image by gallery

        gallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(inten, IMG_RESULT);

            }
        });


    }


    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent data) {


        if (requestCode == pic_id) {


            Bitmap photo = (Bitmap) data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            adhar.setImageBitmap(photo);
        }

        else  if (requestCode == IMG_RESULT && resultCode == RESULT_OK
                && null != data) {


            Uri URI = data.getData();
            String[] FILE = { MediaStore.Images.Media.DATA };


            Cursor cursor = getContentResolver().query(URI,
                    FILE, null, null, null);

            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(FILE[0]);
            ImageDecode = cursor.getString(columnIndex);
            cursor.close();

            adhar.setImageBitmap(BitmapFactory
                    .decodeFile(ImageDecode));

        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}


