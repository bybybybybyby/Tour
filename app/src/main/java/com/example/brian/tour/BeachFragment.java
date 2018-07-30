package com.example.brian.tour;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_page, container, false);

        //Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.laguna), getString(R.string.laguna_desc),
                getString(R.string.laguna_website)));
        places.add(new Place(getString(R.string.santa_monica), getString(R.string.santa_monica_desc), getString(R.string.santa_monica_website)));
        places.add(new Place(getString(R.string.venice), getString(R.string.venice_desc), getString(R.string.venice_website)));
        places.add(new Place(getString(R.string.la_jolla), getString(R.string.la_jolla_desc), getString(R.string.la_jolla_website)));

        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorLight);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
