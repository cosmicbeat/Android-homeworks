package com.softuni.recviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.softuni.recviewdemo.data.BaseModel;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(T data);
}
