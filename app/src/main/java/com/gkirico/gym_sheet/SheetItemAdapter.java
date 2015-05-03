package com.gkirico.gym_sheet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gkirico on 03.05.15.
 */
public class SheetItemAdapter extends RecyclerView.Adapter<SheetItemAdapter.ViewHolder> {

    private List<String> mDataSet;

    public SheetItemAdapter() {

        mDataSet = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            mDataSet.add(Integer.toString(rand.nextInt(100)));
        }

    }

    @Override
    public SheetItemAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_card_view, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.mTextView.setText(mDataSet.get(i));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.cv_title);
        }
    }


}
