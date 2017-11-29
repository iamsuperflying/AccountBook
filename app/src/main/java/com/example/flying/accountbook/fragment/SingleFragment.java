package com.example.flying.accountbook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.flying.accountbook.R;

/**
 * Created by flying on 2017/11/23.
 */

public class SingleFragment extends Fragment {

    public TextView mTextView;

    public static SingleFragment newInstance(){
        return new SingleFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceStat) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mTextView = view.findViewById(R.id.text_view);

        return view;
    }
}
