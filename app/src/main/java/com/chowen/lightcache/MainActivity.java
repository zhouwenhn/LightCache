package com.chowen.lightcache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kit.cn.cachelib.LoadDataManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadDataManager.getInstance().put("key", "value");
        Log.d("MainActivity", LoadDataManager.getInstance().getCache("key"));
    }
}
