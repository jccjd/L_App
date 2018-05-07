package com.example.lenovo.l_app;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationBar mNavigationBar;
    private List<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void init() {

    }

    private void initView() {
         mNavigationBar = (BottomNavigationBar) findViewById(R.id.btm_nav_bar);

    }
}
