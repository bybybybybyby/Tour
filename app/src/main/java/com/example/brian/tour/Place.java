package com.example.brian.tour;

public class Place {

    private String mName;
    private String mWebsite;
    private String mDescription;

    /** Image Resource ID for Place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String description, String website) {
        mName = name;
        mDescription = description;
        mWebsite = website;
    }

    public Place(String name, String description, String website, int imageResourceId) {
        mName = name;
        mDescription = description;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    public String getName() { return mName; }
    public String getDescription() { return mDescription; }
    public String getWebsite() { return mWebsite; }
    public int getImageResourceID() {return mImageResourceId; }

    /**Returns whether or not there is an image for this word*/
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

}
