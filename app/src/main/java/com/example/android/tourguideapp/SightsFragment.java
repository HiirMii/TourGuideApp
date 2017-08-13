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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.grand_canal_name), getString(R.string.grand_canal_address), R.drawable.sights_grand_canal,
                getString(R.string.grand_canal_description), getString(R.string.grand_canal_url)));
        places.add(new Place(getString(R.string.st_marks_basilica_name),
                getString(R.string.st_marks_basilica_address), R.drawable.sights_st_marks_basilica,
                getString(R.string.st_marks_basilica_description),
                getString(R.string.st_marks_basilica_url)));
        places.add(new Place(getString(R.string.doges_palace_name),
                getString(R.string.doges_palace_address), R.drawable.sights_doges_palace,
                getString(R.string.doges_palace_description), getString(R.string.doges_palace_url)));
        places.add(new Place(getString(R.string.piazza_san_marco_name),
                getString(R.string.piazza_san_marco_address), R.drawable.sights_piazza_san_marco,
                getString(R.string.piazza_san_marco_description),
                getString(R.string.piazza_san_marco_url)));
        places.add(new Place(getString(R.string.rialto_bridge_name),
                getString(R.string.rialto_bridge_address), R.drawable.sights_rialto_bridge,
                getString(R.string.rialto_bridge_description), getString(R.string.rialto_bridge_url)));
        places.add(new Place(getString(R.string.gallerie_dell_accademia_name),
                getString(R.string.gallerie_dell_accademia_address),
                R.drawable.sights_gallerie_dell_accademia,
                getString(R.string.gallerie_dell_accademia_description),
                getString(R.string.gallerie_dell_accademia_url)));
        places.add(new Place(getString(R.string.st_marks_campanile_name),
                getString(R.string.st_marks_campanile_address),R.drawable.sights_st_marks_campanile,
                getString(R.string.st_marks_campanile_description),
                getString(R.string.st_marks_campanile_url)));
        places.add(new Place(getString(R.string.bridge_of_sighs_name),
                getString(R.string.bridge_of_sighs_address), R.drawable.sights_bridge_of_sighs,
                getString(R.string.bridge_of_sighs_description),
                getString(R.string.bridge_of_sighs_url)));
        places.add(new Place(getString(R.string.ca_rezzonico_name),
                getString(R.string.ca_rezzonico_address), R.drawable.sights_ca_rezzonico,
                getString(R.string.ca_rezzonico_description), getString(R.string.ca_rezzonico_url)));
        places.add(new Place(getString(R.string.basilica_di_manta_maria_della_salute_name),
                getString(R.string.basilica_di_manta_maria_della_salute_address),
                R.drawable.sights_santa_maria_della_salute,
                getString(R.string.basilica_di_manta_maria_della_salute_description),
                getString(R.string.basilica_di_manta_maria_della_salute_url)));

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
