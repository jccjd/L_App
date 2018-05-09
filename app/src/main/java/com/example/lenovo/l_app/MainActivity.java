package com.example.lenovo.l_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.lenovo.l_app.ui.GithubFragment;
import com.example.lenovo.l_app.ui.HomeFragment;
import com.example.lenovo.l_app.ui.favoriteFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

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
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new GithubFragment());
        mFragments.add(new favoriteFragment());

        mNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_home_white_24dp, "Home"))
                .addItem(new BottomNavigationItem(R.drawable.ic_favorite_white_24dp, "favorite"))
                .addItem(new BottomNavigationItem(R.drawable.ic_github_circle_white_24dp, "Github"))
                .setMode(BottomNavigationBar.MODE_FIXED).initialise();
        setFragments(0);
        mNavigationBar.setTabSelectedListener(this);
    }
    private void setFragments(int position) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.main_container,mFragments.get(position));
        fragmentTransaction.commit();
    }

    private void initView() {
        mNavigationBar = (BottomNavigationBar) findViewById(R.id.btm_nav_bar);

    }


    @Override
    public void onTabSelected(int position) {
        setFragments(position);
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}