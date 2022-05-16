package com.geektech.homework33names;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.name);
    }
    public void bind(String name) {
        tvName.setText(name);
    }
}
