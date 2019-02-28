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


public class PlaceFragment extends Fragment {


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.charminar, R.string.charminar_location, R.drawable.charminar));
        words.add(new Word(R.string.falaknuma_palace, R.string.falaknuma_location, R.drawable.falaknumapalace));
        words.add(new Word(R.string.golconda, R.string.golconda_location, R.drawable.golconda));
        words.add(new Word(R.string.hussain_sagar, R.string.hussain_sagar_location, R.drawable.hussainsagar));
        words.add(new Word(R.string.ramoji_film_city, R.string.ramoji_film_city_location, R.drawable.filmcity));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_tourist_places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(), ListItemClick.class);
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });
        return rootView;

    }

}
