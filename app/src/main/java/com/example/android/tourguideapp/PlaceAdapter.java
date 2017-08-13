package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HiirMii on 2017-06-10.
 */

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Current context (i.e. Activity) that the adapter is being created in.
     * Used to create Intents for specific list item.
     */
    private Context context = getContext();

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        //Get the object's properties
        String name = currentPlace.getPlaceName();
        String address = currentPlace.getPlaceAddress();
        int imageId = currentPlace.getImageResourceId();
        String description = currentPlace.getPlaceDescription();
        String url = currentPlace.getPlaceUrl();

        // Find the TextView in the list_item.xml layout with the ID place_name_text_view.
        TextView placeNameTextView = (TextView)
                listItemView.findViewById(R.id.place_name_text_view);

        // Get the place name from the currentPlace object and set this text on
        // the placeNameTextView.
        placeNameTextView.setText(name);

        // Find the TextView in the list_item.xml layout with the ID place_address_text_view.
        TextView placeAddressTextView = (TextView)
                listItemView.findViewById(R.id.place_address_text_view);

        // Get the place address from the currentPlace object and set this text on
        // the placeAddressTextView.
        placeAddressTextView.setText(address);

        // Find the ImageView in the list_item.xml layout with the ID image.
        final ImageView imageView = (ImageView)
                listItemView.findViewById(R.id.image);

        // display the provided image based on the resource ID
        imageView.setImageResource(imageId);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent descriptionIntent = new Intent(context, PlaceDescriptionActivity.class);

        //Put the Object properties to the intent
        descriptionIntent.putExtra(context.getString(R.string.name_placeholder), name);
        descriptionIntent.putExtra(context.getString(R.string.address_placeholder), address);
        descriptionIntent.putExtra(context.getString(R.string.image_id_placeholder), imageId);
        descriptionIntent.putExtra(context.getString(R.string.description_placeholder), description);
        descriptionIntent.putExtra(context.getString(R.string.url_placeholder), url);

        //Start the intent if the user clicks on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(descriptionIntent);
            }
        });


        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
