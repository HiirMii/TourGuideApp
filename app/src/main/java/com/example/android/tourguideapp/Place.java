package com.example.android.tourguideapp;

/**
 * Created by HiirMii on 2017-06-10.
 */

/**
 * {@link Place} represents a place or attraction that the user wants to visit or check.
 * It contains name, address, description, list to place's website and an image for that place.
 */

public class Place {

    /**
     * Name of the place or attraction
     */
    private String placeName;

    /**
     * Address of the place or short description of the attraction
     */
    private String placeAddress;

    /**
     * Image resource ID for the place/attraction
     */
    private int imageResourceId;

    /**
     * Place/attraction description
     */
    private String placeDescription;

    /**
     * Link to place/attraction website
     */
    private String placeUrl;

    /**
     * Create a new Place object.
     *
     * @param name        is the name of place/attraction
     * @param address     is place's address or attractions short description
     * @param imageId     is the resource ID for the image file associated with this place/attraction
     * @param description is the description of the place/attraction
     * @param url         is the link to place/attraction website
     */
    public Place(String name, String address, int imageId, String description, String url) {
        placeName = name;
        placeAddress = address;
        imageResourceId = imageId;
        placeDescription = description;
        placeUrl = url;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Get the address of the place.
     */
    public String getPlaceAddress() {
        return placeAddress;
    }

    /**
     * Get the image resource ID of the place.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Get the description of the place.
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /**
     * Get the url of the place's website.
     */
    public String getPlaceUrl() {
        return placeUrl;
    }
}
