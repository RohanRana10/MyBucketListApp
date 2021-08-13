package com.rohanrana.mybucketlist;

import androidx.annotation.DrawableRes;

public class BucketListEntry {

    String heading;
    String description;
    int image;
    float ratingValue;

    public BucketListEntry(String heading, String description, @DrawableRes int image, float ratingValue) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.ratingValue = ratingValue;
    }
}
