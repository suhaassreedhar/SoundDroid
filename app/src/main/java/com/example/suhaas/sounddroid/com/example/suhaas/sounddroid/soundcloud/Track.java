package com.example.suhaas.sounddroid.com.example.suhaas.sounddroid.soundcloud;

import com.google.gson.annotations.SerializedName;

public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String artworkURL;

    public String getTitle() {
        return mTitle;
    }

    public String getArtworkURL() {
        return artworkURL;
    }

    public int getID() {
        return mID;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public String getAvatarURL(){
        String avatarURL = artworkURL;
        if (avatarURL != null){
            avatarURL = artworkURL.replace("large", "tiny");
        }
        return avatarURL;
    }
}
