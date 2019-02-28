package com.example.android.tourguide;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemClick1 extends AppCompatActivity {
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
            img.setImageResource(R.drawable.paradise);
            txt.setText(R.string.paradise_desc);
        } else if (pos == 1) {
            img.setImageResource(R.drawable.flechazo);
            txt.setText(R.string.flechazo_desc);
        } else if (pos == 2) {
            img.setImageResource(R.drawable.prego);
            txt.setText(R.string.prego_desc);
        } else if (pos == 3) {
            img.setImageResource(R.drawable.waterfront);
            txt.setText(R.string.water_front_desc);
        } else {
            img.setImageResource(R.drawable.absolutebarbeque);
            txt.setText(R.string.absolute_barbeque_desc);
        }


    }
}

