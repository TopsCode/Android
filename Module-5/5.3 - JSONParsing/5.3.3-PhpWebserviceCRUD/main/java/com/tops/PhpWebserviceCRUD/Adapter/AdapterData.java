/*
 * Copyright (c) Lukman Upt Pusat Data Dan Informasi UMJ
 */

package com.tops.PhpWebserviceCRUD.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.tops.PhpWebserviceCRUD.InsertData;
import com.tops.PhpWebserviceCRUD.Model.ModelData;
import com.tops.PhpWebserviceCRUD.R;

import java.util.List;


public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private List<ModelData> mItems ;
    private Context context;

    public AdapterData (Context context, List<ModelData> items)
    {
        this.mItems = items;
        this.context = context;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row,parent,false);
        HolderData holderData = new HolderData(layout);
        return holderData;
    }

    @Override
    public void onBindViewHolder(HolderData holder, int position) {
        ModelData md  = mItems.get(position);
        holder.tvnama.setText(md.getName());
        holder.tvnpm.setText(md.getNpm());

        holder.md = md;


    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    class HolderData extends RecyclerView.ViewHolder
    {
        TextView tvnama,tvnpm;
        ModelData md;

        public  HolderData (View view)
        {
            super(view);

            tvnama =  view.findViewById(R.id.nama);
            tvnpm =  view.findViewById(R.id.npm);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent update = new Intent(context, InsertData.class);
//                    update.putExtra("update",1);
//                    update.putExtra("npm",md.getNpm());
//                    update.putExtra("nama",md.getNama());
//                    update.putExtra("prodi",md.getProdi());
//                    update.putExtra("fakultas",md.getFakultas());

                    context.startActivity(update);
                }
            });
        }
    }
}
