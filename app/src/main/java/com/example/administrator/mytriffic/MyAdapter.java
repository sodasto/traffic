package com.example.administrator.mytriffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 7/31/2016 AD.
 */
public class MyAdapter extends BaseAdapter{

    // Explicit นี่คือการประกาศตัวแปล
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length; // ให้มันนับจำนวน aray ของมันเองไม่มีการกำหนดว่าได้เท่าไหร่
        // ถ้าต้องการจำกัดขอบเขตให้ใส่ เลขเอา
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_lisview, viewGroup, false);
        //Layout เสมือน

        // For Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //For Text
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView3);
        titleTextView.setText(titleStrings[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView4);
        detailTextView.setText(detailStrings[i]);



        return view1;
    }
}  // Main Class
