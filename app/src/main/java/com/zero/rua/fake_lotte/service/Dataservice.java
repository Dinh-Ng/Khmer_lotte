package com.zero.rua.fake_lotte.service;

import com.zero.rua.fake_lotte.model.VnModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Dataservice {
    @POST("vn")
    @FormUrlEncoded
    Call<List<VnModel>> getVn(@Field("") String str);
}
