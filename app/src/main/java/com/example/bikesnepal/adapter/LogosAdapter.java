package com.example.bikesnepal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bikesnepal.R;

import java.util.ArrayList;

public class LogosAdapter extends RecyclerView.Adapter<LogosAdapter.LogosAdapterViewHolder> {

    private Context context;
    private ArrayList logosArrayList;


    public LogosAdapter(Context context, ArrayList logosArrayList) {
        this.context = context;
        this.logosArrayList = logosArrayList;
    }

    @NonNull
    @Override
    public LogosAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_logos, parent, false);
        return new  LogosAdapterViewHolder(view);
    }

    @Override
        public void onBindViewHolder(@NonNull LogosAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class LogosAdapterViewHolder  extends RecyclerView.ViewHolder{
        public LogosAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
