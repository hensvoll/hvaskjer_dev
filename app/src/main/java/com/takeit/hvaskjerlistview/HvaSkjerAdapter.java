package com.takeit.hvaskjerlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HvaSkjerAdapter extends ArrayAdapter<HvaSkjer> {
    private Context mContext;
    private int mRescource;

    public HvaSkjerAdapter(Context context, int resource, ArrayList<HvaSkjer> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mRescource = resource;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {

        String date = getItem(position).getDate();
        String time = getItem(position).getTime();
        String title = getItem(position).getTitle();
        String place = getItem(position).getPlace();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mRescource,parent,false);

        TextView dateTextView = (TextView)convertView.findViewById(R.id.textView_dato_id);
        TextView timeTextView = (TextView)convertView.findViewById(R.id.textView_kl_id);
        TextView placeTextView = (TextView)convertView.findViewById(R.id.textView_sted_id);
        TextView titleTextView = (TextView)convertView.findViewById(R.id.textView_tittel_id);

        dateTextView.setText(date);
        timeTextView.setText(time);
        placeTextView.setText(place);
        titleTextView.setText(title);
        return convertView;
    }
}
