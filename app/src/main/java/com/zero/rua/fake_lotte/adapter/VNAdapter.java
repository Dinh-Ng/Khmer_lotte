package com.zero.rua.fake_lotte.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zero.rua.fake_lotte.R;
import com.zero.rua.fake_lotte.model.VnModel;

import java.util.List;

public class VNAdapter extends BaseAdapter {
    private List<VnModel> list;
    private LayoutInflater layoutInflater;

    public VNAdapter(Context context, List<VnModel> lists) {
        this.list = lists;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"InflateParams", "SetTextI18n"})
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;

        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_vn, null);
            holder = new ViewHolder();
            holder.txt_date = view.findViewById(R.id.txt_date);

            holder.txt_address = view.findViewById(R.id.txt_address);
            holder.txt_A1 = view.findViewById(R.id.txt_A1);
            holder.txt_B1 = view.findViewById(R.id.txt_B1);
            holder.txt_C1 = view.findViewById(R.id.txt_C1);
            holder.txt_D1 = view.findViewById(R.id.txt_D1);
            holder.txt_A2 = view.findViewById(R.id.txt_A2);
            holder.txt_B2 = view.findViewById(R.id.txt_B2);
            holder.txt_C2 = view.findViewById(R.id.txt_C2);
            holder.txt_D2 = view.findViewById(R.id.txt_D2);

            holder.txt_A1_s = view.findViewById(R.id.txt_A1_s);
            holder.txt_B1_s = view.findViewById(R.id.txt_B1_s);
            holder.txt_C1_s = view.findViewById(R.id.txt_C1_s);
            holder.txt_D1_s = view.findViewById(R.id.txt_D1_s);
            holder.txt_A2_s = view.findViewById(R.id.txt_A2_s);
            holder.txt_B2_s = view.findViewById(R.id.txt_B2_s);
            holder.txt_C2_s = view.findViewById(R.id.txt_C2_s);
            holder.txt_D2_s = view.findViewById(R.id.txt_D2_s);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        String[] date = list.get(position).getDate().split("T");
        String date1 = date[0];

        holder.txt_date.setText(date1);

        String a1 = list.get(position).getNorth().getA().get(0) + "  "
                + list.get(position).getNorth().getA().get(1) + "  "
                + list.get(position).getNorth().getA().get(2) + "  "
                + list.get(position).getNorth().getA().get(3);
        holder.txt_A1.setText(a1);

        String a2 = list.get(position).getNorth().getA().get(4) + "  "
                + list.get(position).getNorth().getA().get(5) + "  "
                + list.get(position).getNorth().getA().get(6);
        holder.txt_A2.setText(a2);
        holder.txt_B1.setText(list.get(position).getNorth().getB().get(0));
        holder.txt_B2.setText(list.get(position).getNorth().getB().get(1));
        holder.txt_C1.setText(list.get(position).getNorth().getC().get(0));
        holder.txt_C2.setText(list.get(position).getNorth().getC().get(1));
        holder.txt_D1.setText(list.get(position).getNorth().getD().get(0));
        holder.txt_D2.setText(list.get(position).getNorth().getD().get(1));

        holder.txt_A1_s.setText(list.get(position).getSouth().getA().get(0));
        holder.txt_A2_s.setText(list.get(position).getSouth().getA().get(1));
        holder.txt_B1_s.setText(list.get(position).getSouth().getB().get(0));
        holder.txt_B2_s.setText(list.get(position).getSouth().getB().get(1));
        holder.txt_C1_s.setText(list.get(position).getSouth().getC().get(0));
        holder.txt_C2_s.setText(list.get(position).getSouth().getC().get(1));
        holder.txt_D1_s.setText(list.get(position).getSouth().getD().get(0));
        holder.txt_D2_s.setText(list.get(position).getSouth().getD().get(1));
        return view;
    }

    private static class ViewHolder {
        TextView txt_date, txt_address, txt_A1, txt_B1, txt_C1, txt_D1, txt_A2, txt_B2, txt_C2, txt_D2;
        TextView txt_A1_s, txt_B1_s, txt_C1_s, txt_D1_s, txt_A2_s, txt_B2_s, txt_C2_s, txt_D2_s;
    }
}
