package com.example.suhaas.sounddroid.com.example.suhaas.sounddroid.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface SoundCloudService {
    static final String CLIENT_ID = "8382a343fb6959c2c4fb7613d26b1980";

    @GET("/tracks?client_id="+CLIENT_ID)
    public void searchSongs(@Query("q") String query, Callback<List<Track>> cb);
}
