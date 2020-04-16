package com.example.demo004;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import cn.hzw.doodle.DoodleActivity;
import cn.hzw.doodle.DoodleParams;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DoodleParams params = new DoodleParams(); // 涂鸦参数
        params.mIsDrawableOutside = true;
        params.mImagePath = getResources().getString(R.mipmap.temp);
        Log.d("res",params.mImagePath);
        DoodleActivity.startActivityForResult(MainActivity.this, params,101);
// 初级涂鸦
        ViewGroup simpleContainer = (ViewGroup) findViewById(R.id.container_simple_doodle);
        SimpleDoodleView simpleDoodleView = new SimpleDoodleView(this);
        simpleContainer.addView(simpleDoodleView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }
}
