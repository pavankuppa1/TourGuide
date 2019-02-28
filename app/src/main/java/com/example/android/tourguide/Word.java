package com.example.android.tourguide;

public class Word {


    private int mPlaceNameId;


    private int mLocationId;


    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int placeNameId, int locationId) {

        mPlaceNameId = placeNameId;

        mLocationId = locationId;

    }


    public Word(int placeNameId, int locationId, int imageResourceId) {

        mPlaceNameId = placeNameId;

        mLocationId = locationId;

        mImageResourceId = imageResourceId;


    }


    public int getmPlaceNameId() {

        return mPlaceNameId;

    }


    public int getmLocationId() {

        return mLocationId;

    }


    public int getImageResourceId() {

        return mImageResourceId;

    }


    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;

    }


}