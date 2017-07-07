package com.example.cj.testactivitytogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skip = (Button) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                startActivity(i);
            }
        });
        Log.i("TAG", "onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "onStart方法被执行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "onResume方法被执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "onPause方法被执行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "onStop方法被执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "onDestroy方法被执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "onRestart方法被执行");
    }
}
