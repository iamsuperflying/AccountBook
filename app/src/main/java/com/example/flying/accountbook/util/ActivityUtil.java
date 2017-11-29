package com.example.flying.accountbook.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.flying.accountbook.activity.BaseActivity;

/**
 * Created by flying on 2017/11/7.
 */

public class ActivityUtil {

    public static void start(Context context,
                             Class<? extends BaseActivity> clazz,
                             boolean ifFinishSelf) {

        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);

        if (ifFinishSelf) {
            ((Activity)context).finish();
        }

    }

}
