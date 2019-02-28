package com.example.android.tourguide;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemClick2 extends AppCompatActivity {
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
            img.setImageResource(R.drawable.birlamandir);
            txt.setText(R.string.birla_mandir_desc);
        } else if (pos == 1) {
            img.setImageResource(R.drawable.chilkurtemple);
            txt.setText(R.string.chilkur_desc);
        } else if (pos == 2) {
            img.setImageResource(R.drawable.karmanghat);
            txt.setText(R.string.karmanghat_desc);
        } else if (pos == 3) {
            img.setImageResource(R.drawable.jagannathtemple);
            txt.setText(R.string.jagannath_desc);
        } else {
            img.setImageResource(R.drawable.keesaragutta);
            txt.setText(R.string.keesara_desc);
        }


    }
}

