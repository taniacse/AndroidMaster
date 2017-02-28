package com.tania.androidmaster.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tania.androidmaster.R;

import java.util.ArrayList;

/**
 * Created by User on 2/25/2017.
 */

public class AdvanceListAdapter extends BaseAdapter {


    Context context = null;
    ArrayList<String> arrayList = null;
    public static final String TAG = "AndroidMaster";
    public static AdvanceListAdapter instance = null;
    public  boolean fun = true;

    public AdvanceListAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    static class ViewHolder {

        public TextView topicsName;
        public  TextView imageCount;
        public ImageView followImage;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {



        instance=this;
        arrayList.get(i);
        AdvanceListAdapter.ViewHolder viewHolder = null;
        View rowView = view;

        if (view == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate(R.layout.advance_row_item, parent, false);

            viewHolder = new AdvanceListAdapter.ViewHolder();
            view.setTag(viewHolder);

        } else {

            viewHolder = (AdvanceListAdapter.ViewHolder) view.getTag();

        }

        viewHolder.topicsName = (TextView) view.findViewById(R.id.headingTextView);
        viewHolder.topicsName.setText(arrayList.get(i));


        return view;
    }
}
