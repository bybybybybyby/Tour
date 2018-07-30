package com.example.brian.tour;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_page, container, false);

        //Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.bowers), getString(R.string.bowers_desc),
                getString(R.string.bowers_website)));
        places.add(new Place(getString(R.string.lacma), getString(R.string.lacma_desc), getString(R.string.lacma_website)));
        places.add(new Place(getString(R.string.broad), getString(R.string.broad_desc), getString(R.string.broad_website)));
        places.add(new Place(getString(R.string.getty), getString(R.string.getty_desc), getString(R.string.getty_website)));
        places.add(new Place(getString(R.string.norton), getString(R.string.norton_desc), getString(R.string.norton_website)));

        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorLight);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}