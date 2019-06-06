package com.zero.rua.fake_lotte.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class North {

    @SerializedName("a")
    @Expose
    private List<String> a = null;
    @SerializedName("b")
    @Expose
    private List<String> b = null;
    @SerializedName("c")
    @Expose
    private List<String> c = null;
    @SerializedName("d")
    @Expose
    private List<String> d = null;

    public List<String> getA() {
        return a;
    }

    public void setA(List<String> a) {
        this.a = a;
    }

    public List<String> getB() {
        return b;
    }

    public void setB(List<String> b) {
        this.b = b;
    }

    public List<String> getC() {
        return c;
    }

    public void setC(List<String> c) {
        this.c = c;
    }

    public List<String> getD() {
        return d;
    }

    public void setD(List<String> d) {
        this.d = d;
    }

}