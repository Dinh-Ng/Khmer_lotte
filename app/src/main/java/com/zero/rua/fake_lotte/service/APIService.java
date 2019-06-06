package com.zero.rua.fake_lotte.service;

public class APIService {
    public APIService() {
    }
    private static final String base_url = "https://api.cam24h.club/";

    public static Dataservice getService() {
        return RetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
