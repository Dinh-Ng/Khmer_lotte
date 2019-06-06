package com.zero.rua.fake_lotte.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VnModel {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("north")
    @Expose
    private North north;
    @SerializedName("south")
    @Expose
    private South south;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public North getNorth() {
        return north;
    }

    public void setNorth(North north) {
        this.north = north;
    }

    public South getSouth() {
        return south;
    }

    public void setSouth(South south) {
        this.south = south;
    }

}