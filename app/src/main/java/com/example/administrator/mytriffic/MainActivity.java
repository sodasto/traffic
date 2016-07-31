package com.example.administrator.mytriffic;

import android.content.Intent;
import android.hardware.camera2.params.RggbChannelVector;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปล มี แบบ สาธารณะ กับ ส่วนตัว

    private String urlYoutubeString;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        //Setup array for integer
        int[] iconInts = new int[20];
        iconInts[0] = R.drawable.traffic_01;
        iconInts[1] = R.drawable.traffic_02;
        iconInts[2] = R.drawable.traffic_03;
        iconInts[3] = R.drawable.traffic_04;
        iconInts[4] = R.drawable.traffic_05;
        iconInts[5] = R.drawable.traffic_06;
        iconInts[6] = R.drawable.traffic_07;
        iconInts[7] = R.drawable.traffic_08;
        iconInts[8] = R.drawable.traffic_09;
        iconInts[9] = R.drawable.traffic_10;
        iconInts[10] = R.drawable.traffic_11;
        iconInts[11] = R.drawable.traffic_12;
        iconInts[12] = R.drawable.traffic_13;
        iconInts[13] = R.drawable.traffic_14;
        iconInts[14] = R.drawable.traffic_15;
        iconInts[15] = R.drawable.traffic_16;
        iconInts[16] = R.drawable.traffic_17;
        iconInts[17] = R.drawable.traffic_18;
        iconInts[18] = R.drawable.traffic_19;
        iconInts[19] = R.drawable.traffic_20;

        //For Setup Title
        String[] titleStrings = getResources().getStringArray(R.array.my_title);

        String[] detailLongStrings = getResources().getStringArray(R.array.my_datail);

        String[] detailShot = new String[detailLongStrings.length];
        for (int i=0;i<detailLongStrings.length;i+=1) {
            detailShot[i]= detailLongStrings[i].substring(0, 20) + "..."; // "..." ให้ตัดคำที่20 ตัวอักษรหลัง 20 ให้ .. ต่อไป

        }

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(this, iconInts, titleStrings, detailShot);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);

            }
        });

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
