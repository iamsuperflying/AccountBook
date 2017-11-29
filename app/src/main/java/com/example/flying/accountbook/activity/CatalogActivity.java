package com.example.flying.accountbook.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.flying.accountbook.R;
import com.example.flying.accountbook.adapter.CatalogAdapter;
import com.example.flying.accountbook.model.DailySingleton;

/**
 * Created by flying on 2017/11/27.
 */

public class CatalogActivity extends BaseActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_catalog);
        setUpUI();

    }

    private void setUpUI() {
        mRecyclerView = findViewById(R.id.catalogs_recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(CatalogActivity.this, 6);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new CatalogAdapter(DailySingleton
                .getDailySingleton(CatalogActivity.this).getCatalogItems()));

    }
}
