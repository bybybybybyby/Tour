package com.example.brian.tour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_page, container, false);

        //Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.pinks), getString(R.string.pinks_description),
                getString(R.string.pinks_website), R.drawable.pinks));
        places.add(new Place(getString(R.string.in_n_out), getString(R.string.in_n_out_description),
                getString(R.string.in_n_out_website), R.drawable.innout));
        places.add(new Place(getString(R.string.tommys), getString(R.string.tommys_description),
                getString(R.string.tommys_website), R.drawable.tommys));
        places.add(new Place(getString(R.string.phillipes), getString(R.string.phillipes_description),
                getString(R.string.philippes_website), R.drawable.philippes));

        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorLight);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
