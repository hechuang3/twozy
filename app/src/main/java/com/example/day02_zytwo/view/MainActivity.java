package com.example.day02_zytwo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day02_zytwo.R;
import com.example.day02_zytwo.adapter.HomeAdapter;
import com.example.day02_zytwo.base.BaseActivity;
import com.example.day02_zytwo.bean.HomeBean;
import com.example.day02_zytwo.contract.MainContract;
import com.example.day02_zytwo.presenter.MainPresenter;

import java.util.ArrayList;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.MainView {
    private RecyclerView rel;
    private ArrayList<HomeBean.NewsDTO> list;
    private HomeAdapter homeAdapter;

    @Override
    protected void initData() {
        per.getData();
    }

    @Override
    protected void initView() {
            rel=findViewById(R.id.rel);
            rel.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(list, this);
        rel.setAdapter(homeAdapter);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter getPer() {
        return new MainPresenter(this);
    }

    @Override
    public void onSuceess(HomeBean homeBean) {
        list.addAll(homeBean.getNews());
        homeAdapter.notifyDataSetChanged();
    }
}