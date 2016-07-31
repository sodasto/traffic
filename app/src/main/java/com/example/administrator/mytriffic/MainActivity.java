package com.example.administrator.mytriffic;

import android.content.Intent;
import android.hardware.camera2.params.RggbChannelVector;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปล มี แบบ สาธารณะ กับ ส่วนตัว

    private String urlYoutubeString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//Main Method


    public void clickAboutMe(View view) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.effect_btn_long);
        mediaPlayer.start();

        // intent to webview

        urlYoutubeString = "https://youtu.be/AWMqoSJfJMc";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));
        startActivity(intent);

        // Shift command enter สำหรับเติมเครื่องหมายปิดคำสั่งเอง แทน : หรือ ;









    }



} // Main Class
