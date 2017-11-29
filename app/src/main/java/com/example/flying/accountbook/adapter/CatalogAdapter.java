package com.example.flying.accountbook.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.flying.accountbook.R;
import com.example.flying.accountbook.model.CatalogItem;

import java.util.List;

/**
 * Created by flying on 2017/11/28.
 */

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.CatalogHolder> {

    private List<CatalogItem> mCatalogItems;

    public CatalogAdapter(List<CatalogItem> catalogItems) {
        mCatalogItems = catalogItems;
    }

    public class CatalogHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;

        private TextView mTextView;

        public CatalogHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.catalog_img);
            mTextView = itemView.findViewById(R.id.catalog_name);
        }
    }

    @Override
    public CatalogHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.catalog_list_item, parent, false);
        return new CatalogHolder(view);
    }

    @Override
    public void onBindViewHolder(CatalogHolder holder, int position) {

        CatalogItem catalogItem = mCatalogItems.get(position);
        holder.mTextView.setText(catalogItem.getCatalogName());

    }

    @Override
    public int getItemCount() {
        return mCatalogItems.size();
    }




}
