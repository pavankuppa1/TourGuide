package com.example.android.tourguide;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemClick3 extends AppCompatActivity {
    int pos;
    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitemclick);
        Intent i = getIntent();
        pos = i.getExtras().getInt("position");
        img = (ImageView) findViewById(R.id.listitemclick);
        txt = (TextView) findViewById(R.id.item_name);
        if (pos == 0) {
            img.setImageResource(R.drawable.forum);
            txt.setText(R.string.forum_mall_desc);
        } else if (pos == 1) {
            img.setImageResource(R.drawable.inorbit);
            txt.setText(R.string.inorbit_mall_desc);
        } else if (pos == 2) {
            img.setImageResource(R.drawable.nextgalleria);
            txt.setText(R.string.next_galleria_mall_desc);
        } else if (pos == 3) {
            img.setImageResource(R.drawable.manjeera);
            txt.setText(R.string.manjeera_mall_desc);
        } else {
            img.setImageResource(R.drawable.cinepolis);
            txt.setText(R.string.cinepolis_mall_desc);
        }


    }
}


