package com.example.movieapp.responses;

import com.example.movieapp.models.TVShow;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowsResponse {


    @SerializedName("page")
    public int page;

    @SerializedName("pages")
    private int total_pages;

    @SerializedName("tv_shows")
    private List<TVShow> tvShows;

    public int getPage() {
        return page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<TVShow> getTvShows() {
        return tvShows;
    }
}
