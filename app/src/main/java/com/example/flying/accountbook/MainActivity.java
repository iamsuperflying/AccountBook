package com.example.flying.accountbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.flying.accountbook.activity.CatalogActivity;
import com.example.flying.accountbook.fragment.DailyFragment;
import com.example.flying.accountbook.fragment.SingleFragment;
import com.example.flying.accountbook.model.Daily;
import com.example.flying.accountbook.model.DailySingleton;
import com.example.flying.accountbook.util.ActivityUtil;

import org.litepal.tablemanager.Connector;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private DailyFragment creatFragment(){
        return DailyFragment.newInstance();
    }


    /**
     *  头部 ViewPager
     */
    private ViewPager mViewPager;

    private Button mDailyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.home_view_pager);
        mDailyButton = (Button) findViewById(R.id.daily_button);

        mDailyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityUtil.start(MainActivity.this,  CatalogActivity.class, true);

            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                SingleFragment fragment = SingleFragment.newInstance();
                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });

        Connector.getDatabase();

//        DailyFragment fragment = (DailyFragment) fragmentManager.findFragmentById(R.id.daily_fragment);
//
//        if (fragment == null) {
//            fragment = creatFragment();
//            fragmentManager.beginTransaction()
//                    .add(R.id.daily_fragment, fragment)
//                    .commit();
//        }

    }

}
