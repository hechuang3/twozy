package com.example.day02_zytwo.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {
    public T per;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(per==null){
            per=getPer();
            per.attachView(this);
        }
        initView();
        initData();
    }
    protected abstract void initData();
    protected abstract void initView();
    protected abstract int getLayoutID();
    public abstract T getPer();
}
