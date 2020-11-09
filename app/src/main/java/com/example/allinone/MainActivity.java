package com.example.allinone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.allinone.Activities.ContinuousGPSUpdate;
import com.example.allinone.Activities.DialogActivity;
import com.example.allinone.Activities.PermissionsActivity;
import com.example.allinone.Activities.SignatureView;
import com.example.allinone.Activities.TimeDateActivity;
import com.example.allinone.CameraGalleryPaths.CameraGalleryPathSaveActivity;
import com.example.allinone.UploadImageClasses.UploadImages;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button timeDateBtn, dialogBtn, uploadImages;
    private Button permissions, gps_location_update;
    private Button camera_galleryPath_save, signatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeDateBtn=findViewById(R.id.time_btn);
        dialogBtn=findViewById(R.id.dialog_btn);
        uploadImages=findViewById(R.id.upload_images);
        permissions=findViewById(R.id.permissions);
        gps_location_update=findViewById(R.id.gps_location_update);
        camera_galleryPath_save=findViewById(R.id.camera_galleryPath_save);
        signatureView=findViewById(R.id.signatureView);
        signatureView.setOnClickListener(this);

        timeDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, TimeDateActivity.class);
                startActivity(i);


            }
        });

        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(MainActivity.this, DialogActivity.class);
                startActivity(i1);
            }
        });

        uploadImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(MainActivity.this, UploadImages.class);
                startActivity(i2);
                /* This is a test to check on how to commit to GITHUB. */
            }
        });

        permissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(MainActivity.this, PermissionsActivity.class);
                startActivity(i3);
            }
        });

        gps_location_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(MainActivity.this, ContinuousGPSUpdate.class);
                startActivity(i4);
            }
        });

        camera_galleryPath_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(MainActivity.this, CameraGalleryPathSaveActivity.class);
                startActivity(i5);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signatureView:
                Intent i6= new Intent(MainActivity.this, SignatureView.class);
                startActivity(i6);
            break;

        }

    }
}