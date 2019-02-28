package com.example.android.tourguide;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemClick extends AppCompatActivity {
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
            img.setImageResource(R.drawable.charminar);
            txt.setText(R.string.charminar_desc);
        } else if (pos == 1) {
            img.setImageResource(R.drawable.falaknumapalace);
            txt.setText(R.string.falaknuma_desc);
        } else if (pos == 2) {
            img.setImageResource(R.drawable.golconda);
            txt.setText(R.string.golconda_desc);
        } else if (pos == 3) {
            img.setImageResource(R.drawable.hussainsagar);
            txt.setText(R.string.hussainsagar_desc);
        } else {
            img.setImageResource(R.drawable.filmcity);
            txt.setText(R.string.ramoji_film_dity_desc);
        }


    }
}
