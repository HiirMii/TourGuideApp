package com.example.android.tourguideapp;


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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.gondola_ride_name),
                getString(R.string.gondola_ride_address),
                R.drawable.attractions_gondola_ride, getString(R.string.gondola_ride_description),
                getString(R.string.gondola_ride_url)));
        places.add(new Place(getString(R.string.venice_food_and_wine_name),
                getString(R.string.venice_food_and_wine_address),
                R.drawable.attractions_venice_food_and_wine,
                getString(R.string.venice_food_and_wine_description),
                getString(R.string.venice_food_and_wine_url)));
        places.add(new Place(getString(R.string.the_carnival_of_venice_name),
                getString(R.string.the_carnival_of_venice_address),
                R.drawable.attractions_the_carnival_of_venice,
                getString(R.string.the_carnival_of_venice_description),
                getString(R.string.the_carnival_of_venice_url)));
        places.add(new Place(getString(R.string.campanile_view_name),
                getString(R.string.campanile_view_address),
                R.drawable.attractions_campanile_view, getString(R.string.campanile_view_description),
                getString(R.string.campanile_view_url)));
        places.add(new Place(getString(R.string.casanovas_story_name),
                getString(R.string.casanovas_story_address),
                R.drawable.attractions_casanovas_story,
                getString(R.string.casanovas_story_description),
                getString(R.string.casanovas_story_url)));
        places.add(new Place(getString(R.string.museo_della_musica_name),
                getString(R.string.museo_della_musica_address),
                R.drawable.attractions_museo_della_musica,
                getString(R.string.museo_della_musica_description),
                getString(R.string.museo_della_musica_url)));
        places.add(new Place(getString(R.string.the_peggy_guggenheim_collection_name),
                getString(R.string.the_peggy_guggenheim_collection_address),
                R.drawable.attractions_the_peggy_guggenheim_collection,
                getString(R.string.the_peggy_guggenheim_collection_description),
                getString(R.string.the_peggy_guggenheim_collection_url)));
        places.add(new Place(getString(R.string.lido_islands_beach_name),
                getString(R.string.lido_islands_beach_address),
                R.drawable.attractions_lido_islands_beach,
                getString(R.string.lido_islands_beach_description),
                getString(R.string.lido_islands_beach_url)));
        places.add(new Place(getString(R.string.murano_name),
                getString(R.string.murano_address),
                R.drawable.attractions_murano_glass, getString(R.string.murano_description),
                getString(R.string.murano_url)));
        places.add(new Place(getString(R.string.colorful_burano_island_name),
                getString(R.string.colorful_burano_island_address),
                R.drawable.attractions_colorful_burano_island,
                getString(R.string.colorful_burano_island_description),
                getString(R.string.colorful_burano_island_url)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
