package com.example.flying.accountbook.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.flying.accountbook.R;
import com.example.flying.accountbook.model.Daily;

import java.util.List;

/**
 * Created by flying on 2017/11/27.
 * @author flying
 */

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.DailyViewHolder> {

    private List<Daily> mDailies;

    static class DailyViewHolder extends RecyclerView.ViewHolder {

        ImageView catalogImage;
        TextView catalogName;
        TextView priceText;

        public DailyViewHolder(View view) {
            super(view);
            catalogImage = view.findViewById(R.id.daily_catalog_img);
            catalogName = view.findViewById(R.id.daily_catalog_text);
            priceText = view.findViewById(R.id.daily_price_text);
        }

    }

    public DailyAdapter(List<Daily> dailies) {
        mDailies = dailies;
    }

    @Override
    public DailyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daily_list_item, parent, false);
        DailyViewHolder holder = new DailyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DailyViewHolder holder, int position) {

        Daily daily = mDailies.get(position);
        holder.catalogName.setText(daily.getCategory());
        holder.priceText.setText(daily.getPrice());

    }

    @Override
    public int getItemCount() {
        return mDailies.size();
    }



}
