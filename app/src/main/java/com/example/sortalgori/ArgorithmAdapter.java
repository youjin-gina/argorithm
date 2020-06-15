package com.example.sortalgori;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ArgorithmAdapter extends RecyclerView.Adapter<ArgorithmAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> argorithmList;


    public ArgorithmAdapter(Context context, ArrayList<String> argorithmList) {
        this.context = context;
        this.argorithmList = argorithmList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.argorithm_item,parent);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(argorithmList.get(position));
    }

    @Override
    public int getItemCount() {
        return argorithmList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
        }
    }
}
