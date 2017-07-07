package com.example.cj.testactivitytogether;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by CJ on 2017/7/7.
 */

public class NewActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Log.i("TAG", "NewActivity的onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "NewActivity的onStart方法被执行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "NewActivity的onResume方法被执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "NewActivity的onPause方法被执行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "NewActivity的onStop方法被执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "NewActivity的onDestroy方法被执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "NewActivity的onRestart方法被执行");
    }

}
