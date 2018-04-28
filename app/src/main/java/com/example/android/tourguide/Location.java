package com.example.android.tourguide;

public class Location {

    /**
     * Name of the Location
     */
    private String mLocationName;

    /**
     * Address of the Location
     */
    private String mLocationAddress;

    /**
     * Description of the Location
     */
    private String mLocationDescription;

    /**
     * Image resource id for the Location
     */
    private int mImageResourceId;

    /**
     * Constant value that represents no image was provided for this Location
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object for the detail activity with Name, Address, Description and an Image.
     *
     * @param LocationName        is the Location name
     * @param LocationAddress     is the Location Address
     * @param LocationDescription is the Location Description
     * @param ImageResourceId     is the Image Resource Id.
     */
    public Location(String LocationName, String LocationAddress, String LocationDescription, int ImageResourceId) {
        mLocationName = LocationName;
        mLocationAddress = LocationAddress;
        mLocationDescription = LocationDescription;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the Location Name.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the Location Address.
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Get the Location Description.
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }

    /**
     * Get the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
