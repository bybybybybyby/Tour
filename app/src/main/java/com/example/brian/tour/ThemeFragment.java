package com.example.brian.tour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThemeFragment extends Fragment {


    public ThemeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_page, container, false);

        //Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.disneyland), getString(R.string.disneyland_desc), getString(R.string.disneyland_website)));
        places.add(new Place(getString(R.string.universal), getString(R.string.universal_desc), getString(R.string.universal_website)));
        places.add(new Place(getString(R.string.knotts), getString(R.string.knotts_desc), getString(R.string.knotts_website)));
        places.add(new Place(getString(R.string.magic), getString(R.string.magic_desc), getString(R.string.magic_website)));
        places.add(new Place(getString(R.string.san_diego), getString(R.string.san_diego_desc), getString(R.string.san_diego_website)));
        places.add(new Place(getString(R.string.sea_world), getString(R.string.sea_world_desc), getString(R.string.sea_world_website)));

        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorLight);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
