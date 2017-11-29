package com.example.flying.accountbook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.flying.accountbook.R;
import com.example.flying.accountbook.adapter.DailyAdapter;
import com.example.flying.accountbook.model.Daily;
import com.example.flying.accountbook.model.DailySingleton;

import java.util.Date;
import java.util.List;

/**
 * Created by flying on 2017/11/24.
 */

public class DailyFragment extends Fragment {

    private DailySingleton mDailySingleton;

    private RecyclerView mRecyclerView;

    private Button mButton;

    private List<Daily> mDailies;

    public static DailyFragment newInstance(){
        return new DailyFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化 beatbox class
        mDailySingleton = DailySingleton.getDailySingleton(getActivity());
        mDailies = mDailySingleton.getDailies();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        mRecyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        final DailyAdapter adapter = new DailyAdapter(mDailies);
        mRecyclerView.setAdapter(adapter);
        mButton = view.findViewById(R.id.daily_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Daily daily = new Daily();
                daily.setCategory("娱乐");
                daily.setPrice("699");
                mDailies.add(daily);
                adapter.notifyDataSetChanged();
            }
        });

        return view;

    }


}
