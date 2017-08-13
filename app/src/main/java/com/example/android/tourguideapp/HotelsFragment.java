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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.hilton_molino_stucky_name),
                getString(R.string.hilton_molino_stucky_address),
                R.drawable.hotels_hilton_molino_stucky,
                getString(R.string.hilton_molino_stucky_description),
                getString(R.string.hilton_molino_stucky_url)));
        places.add(new Place(getString(R.string.starhotels_splendid_name),
                getString(R.string.starhotels_splendid_address),
                R.drawable.hotels_starhotels_splendid,
                getString(R.string.starhotels_splendid_description),
                getString(R.string.starhotels_splendid_url)));
        places.add(new Place(getString(R.string.jw_marriott_venice_resort_spa_name),
                getString(R.string.jw_marriott_venice_resort_spa_address),
                R.drawable.hotels_jw_marriott_venice_resort_spa,
                getString(R.string.jw_marriott_venice_resort_spa_description),
                getString(R.string.jw_marriott_venice_resort_spa_url)));
        places.add(new Place(getString(R.string.hotel_nh_collection_venezia_palazzo_barocci_name),
                getString(R.string.hotel_nh_collection_venezia_palazzo_barocci_address),
                R.drawable.hotels_hotel_nh_collection_venezia_palazzo_barocci,
                getString(R.string.hotel_nh_collection_venezia_palazzo_barocci_description),
                getString(R.string.hotel_nh_collection_venezia_palazzo_barocci_url)));
        places.add(new Place(getString(R.string.hotel_a_la_commedia_name),
                getString(R.string.hotel_a_la_commedia_address),
                R.drawable.hotels_hotel_a_la_commedia,
                getString(R.string.hotel_a_la_commedia_description),
                getString(R.string.hotel_a_la_commedia_url)));
        places.add(new Place(getString(R.string.hotel_danieli_name),
                getString(R.string.hotel_danieli_address), R.drawable.hotels_hotel_danieli,
                getString(R.string.hotel_danieli_description), getString(R.string.hotel_danieli_url)));
        places.add(new Place(getString(R.string.hotel_metropole_name),
                getString(R.string.hotel_metropole_address),
                R.drawable.hotels_hotel_metropole, getString(R.string.hotel_metropole_description),
                getString(R.string.hotel_metropole_url)));
        places.add(new Place(getString(R.string.belmond_hotel_cipriani_name),
                getString(R.string.belmond_hotel_cipriani_address),
                R.drawable.hotels_belmond_hotel_cipriani,
                getString(R.string.belmond_hotel_cipriani_description),
                getString(R.string.belmond_hotel_cipriani_url)));
        places.add(new Place(getString(R.string.boscolo_venezia_name),
                getString(R.string.boscolo_venezia_address),
                R.drawable.hotels_boscolo_venezia, getString(R.string.boscolo_venezia_description),
                getString(R.string.boscolo_venezia_url)));
        places.add(new Place(getString(R.string.canal_grande_hotel_name),
                getString(R.string.canal_grande_hotel_address),
                R.drawable.hotels_canal_grande_hotel,
                getString(R.string.canal_grande_hotel_description),
                getString(R.string.canal_grande_hotel_url)));

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
