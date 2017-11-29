package com.example.flying.accountbook.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

/**
 * Created by flying on 2017/11/6.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 没有 nav
        requestWindowFeature(Window.FEATURE_NO_TITLE);

    }
}
