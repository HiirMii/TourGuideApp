package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_description);

        //Get the properties of the Place Object from the intent
        Bundle b = getIntent().getExtras();
        String placeName = b.getString(getString(R.string.name_placeholder));
        String placeAddress = b.getString(getString(R.string.address_placeholder));
        final int placeImageResourceID = b.getInt(getString(R.string.image_id_placeholder));
        String placeDescription = b.getString(getString(R.string.description_placeholder));
        final String placeUrl = b.getString(getString(R.string.url_placeholder));

        //Set the name of the place as the title of the screen
        this.setTitle(placeName);

        //Activate Up Button to enable the navigation back to the MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find the ImageView in the activity_place_description.xml layout
        // with the ID description_image.
        ImageView imageView = (ImageView) findViewById(R.id.description_image);

        // display the provided image based on the resource ID
        imageView.setImageResource(placeImageResourceID);

        // Find the TextView in the activity_place_description.xml layout
        // with the ID description_name.
        TextView nameTextView = (TextView) findViewById(R.id.description_name);

        // display the provided text
        nameTextView.setText(placeName);

        // Find the TextView in the activity_place_description.xml layout
        // with the ID description_address.
        TextView addressTextView = (TextView) findViewById(R.id.description_address);

        // display the provided text
        addressTextView.setText(placeAddress);

        // Find the TextView in the activity_place_description.xml layout
        // with the ID description_text.
        TextView descriptionTextView = (TextView) findViewById(R.id.description_text);

        // display the provided text
        descriptionTextView.setText(placeDescription);

        // Find the TextView in the activity_place_description.xml layout
        // with the ID description_more_info.
        TextView urlTextView = (TextView) findViewById(R.id.description_more_info);
        urlTextView.setText(R.string.description_more_info);
        urlTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If clicking on the text, goes to the url of the place
                Uri webPage = Uri.parse(placeUrl);
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, webPage);
                if (urlIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(urlIntent);
                }
            }
        });
    }

}
