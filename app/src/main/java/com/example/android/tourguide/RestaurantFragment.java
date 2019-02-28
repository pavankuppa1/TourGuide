package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.paradise, R.string.paradise_location, R.drawable.paradise));
        words.add(new Word(R.string.flechazo, R.string.flechazo_location, R.drawable.flechazo));
        words.add(new Word(R.string.prego, R.string.prego_location, R.drawable.prego));
        words.add(new Word(R.string.water_front, R.string.water_front_location, R.drawable.waterfront));
        words.add(new Word(R.string.absolutebarbeque, R.string.absolute_barbeque_location, R.drawable.absolutebarbeque));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(), ListItemClick1.class);
                intent.putExtra("position", i);
                startActivity(intent);

            }
        });
        return rootView;

    }


}
