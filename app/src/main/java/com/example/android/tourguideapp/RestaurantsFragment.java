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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.il_paradiso_perduto_name),
                getString(R.string.il_paradiso_perduto_address),
                R.drawable.restaurants_il_paradiso_perduto,
                getString(R.string.il_paradiso_perduto_description),
                getString(R.string.il_paradiso_perduto_url)));
        places.add(new Place(getString(R.string.osteria_enoteca_ai_artisti_name),
                getString(R.string.osteria_enoteca_ai_artisti_address),
                R.drawable.restaurants_osteria_enoteca_ai_artisti,
                getString(R.string.osteria_enoteca_ai_artisti_description),
                getString(R.string.osteria_enoteca_ai_artisti_url)));
        places.add(new Place(getString(R.string.bistrot_de_venise_name),
                getString(R.string.bistrot_de_venise_address),
                R.drawable.restaurant_bistrot_de_venise_name,
                getString(R.string.bistrot_de_venise_description),
                getString(R.string.bistrot_de_venise_url)));
        places.add(new Place(getString(R.string.restaurant_la_caravella_name),
                getString(R.string.restaurant_la_caravella_address),
                R.drawable.restaurant_restaurant_la_caravella,
                getString(R.string.restaurant_la_caravella_description),
                getString(R.string.restaurant_la_caravella_url)));
        places.add(new Place(getString(R.string.osteria_antico_giardinetto_name),
                getString(R.string.osteria_antico_giardinetto_address),
                R.drawable.restaurant_osteria_antico_giardinetto,
                getString(R.string.osteria_antico_giardinetto_description),
                getString(R.string.osteria_antico_giardinetto_url)));
        places.add(new Place(getString(R.string.ai_mercanti_name),
                getString(R.string.ai_mercanti_address),
                R.drawable.restaurant_ai_mercanti, getString(R.string.ai_mercanti_description),
                getString(R.string.ai_mercanti_url)));
        places.add(new Place(getString(R.string.la_zucca_name),
                getString(R.string.la_zucca_address), R.drawable.restaurant_la_zucca,
                getString(R.string.la_zucca_description), getString(R.string.la_zucca_url)));
        places.add(new Place(getString(R.string.osteria_alla_ciurma_name),
                getString(R.string.osteria_alla_ciurma_address),
                R.drawable.restaurant_osteria_alla_ciurma,
                getString(R.string.osteria_alla_ciurma_description),
                getString(R.string.osteria_alla_ciurma_url)));
        places.add(new Place(getString(R.string.la_colombina_name),
                getString(R.string.la_colombina_address),
                R.drawable.restaurant_la_colombina, getString(R.string.la_colombina_description),
                getString(R.string.la_colombina_url)));
        places.add(new Place(getString(R.string.corte_sconta_name),
                getString(R.string.st_marks_campanile_address), R.drawable.restaurant_corte_sconta,
                getString(R.string.corte_sconta_description), getString(R.string.corte_sconta_url)));

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
