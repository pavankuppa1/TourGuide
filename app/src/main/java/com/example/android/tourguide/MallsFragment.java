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


public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.forum_mall, R.string.forum_mall_location, R.drawable.forum));
        words.add(new Word(R.string.inorbit_mall, R.string.inorbit_mall_location, R.drawable.inorbit));
        words.add(new Word(R.string.next_galleria_mall, R.string.next_galleria_mall_location, R.drawable.nextgalleria));
        words.add(new Word(R.string.manjeera_mall, R.string.manjeera_mall_location, R.drawable.manjeera));
        words.add(new Word(R.string.cinepolis_mall, R.string.cinepolis_mall_location, R.drawable.cinepolis));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_malls);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(), ListItemClick3.class);
                intent.putExtra("position", i);
                startActivity(intent);

            }
        });
        return rootView;

    }

}
