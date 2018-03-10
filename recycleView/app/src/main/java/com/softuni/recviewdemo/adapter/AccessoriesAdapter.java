package com.softuni.recviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softuni.recviewdemo.R;
import com.softuni.recviewdemo.data.BaseModel;

import java.util.List;

public class AccessoriesAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final int TYPE_ACCESSORY = 1;

    private List<BaseModel> data;

    public AccessoriesAdapter(List<BaseModel> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        BaseModel item = data.get(position);

        return TYPE_ACCESSORY;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder vh = null;
        if(viewType == TYPE_ACCESSORY) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_accessory, parent, false);
            vh = new AccessoryViewHolder(view);
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        BaseModel item = data.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
