package com.example.brian.tour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resouce ID for the background color for this list
     */
    private int mColorResourceID;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceID = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentPlace.getDescription());

        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);
        websiteTextView.setText(currentPlace.getWebsite());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.list_item_text);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}

