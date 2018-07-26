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
        places.add(new Place("Pink's Hot Dogs", "Legendary Hot Dogs", "www.pinkshollywood.com"));
        places.add(new Place("In N Out", "Legendary Hot Dogs", "www.pinkshollywood.com"));
        places.add(new Place("The Original Tommy's", "Legendary Hot Dogs", "www.pinkshollywood.com"));
        places.add(new Place("Phillipe the Original", "The Original French Dipped Sandwich", "www.pinkshollywood.com"));

        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.colorAccent);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
