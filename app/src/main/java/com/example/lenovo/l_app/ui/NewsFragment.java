package com.example.lenovo.l_app.ui;


import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.l_app.R;
import com.example.lenovo.l_app.net.News;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private View mView;
    private List<News> mNews;


    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_news, container, false);
        initview();
        init();
        return mView;

    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    
    private void init() {
        mNews = new ArrayList<>();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


    }


    private void initview() {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recycler_view);
    }

}
