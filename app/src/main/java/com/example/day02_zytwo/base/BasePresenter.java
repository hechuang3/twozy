package com.example.day02_zytwo.base;

public class BasePresenter<V extends BaseView>  {
    public V iView;
    public void attachView(V v){
        iView=v;
    };
}
