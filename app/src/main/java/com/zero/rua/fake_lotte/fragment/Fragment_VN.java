package com.zero.rua.fake_lotte.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.zero.rua.fake_lotte.R;
import com.zero.rua.fake_lotte.adapter.VNAdapter;
import com.zero.rua.fake_lotte.model.Vn;
import com.zero.rua.fake_lotte.model.VnModel;
import com.zero.rua.fake_lotte.service.APIService;
import com.zero.rua.fake_lotte.service.BaseCallBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fragment_VN extends Fragment {
    VNAdapter vnAdapter;
    ListView listView;

    public Fragment_VN() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.list_view);

        getData();
    }

    public void getData() {
        APIService.getService().getVn("str").enqueue(new BaseCallBack<List<VnModel>>() {
            @Override
            public void onSuccess(List<VnModel> result) {
                String s = new Gson().toJson(result);
                Log.d("check_success", "login_status: " + s);
                vnAdapter = new VNAdapter(getActivity(), result);
                listView.setAdapter(vnAdapter);
            }

            @Override
            public void onFail(String s) {
                Log.e("check_fail", "login : " + s);
            }
        });

//        Vn list = Arrays.asList(("29-05-2019"), ("Mien bac"), ("1"), ("1"), ("1"), ("1"), ("1"), ("1"), ("1"), ("1"));
//        Vn list = new Vn("29-05-2019", "Mien bac", "81 30 48 94", "402 253 030", "19", "146", "46", "191", "16", "914");
//        List<Vn> vnList = new ArrayList<>();
//        vnList.add(list);
//        vnAdapter = new VNAdapter(getActivity(), vnList);
//        listView.setAdapter(vnAdapter);
    }
}
