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


public class TempleFragment extends Fragment {


    public TempleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.birlamandir, R.string.birlamandir_location, R.drawable.birlamandir));
        words.add(new Word(R.string.chilkur_temple, R.string.chilkur_temple_location, R.drawable.chilkurtemple));
        words.add(new Word(R.string.hanuman_temple, R.string.hanuman_temple_location, R.drawable.karmanghat));
        words.add(new Word(R.string.jagannath_temple, R.string.jagannath_temple_location, R.drawable.jagannathtemple));
        words.add(new Word(R.string.keesara_temple, R.string.keesara_temple_location, R.drawable.keesaragutta));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_temples);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(), ListItemClick2.class);
                intent.putExtra("position", i);
                startActivity(intent);

            }
        });
        return rootView;

    }


}
