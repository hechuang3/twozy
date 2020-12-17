package com.example.day02_zytwo.model;

import com.example.day02_zytwo.contract.MainContract;
import com.example.day02_zytwo.presenter.MainPresenter;
import com.example.day02_zytwo.utils.net.CallBack;
import com.example.day02_zytwo.utils.net.RetrofitUtils;

public class MainModel implements MainContract.MainModel{
    private MainContract.MainPresenter mainPresenter;

    public MainModel(MainContract.MainPresenter mainPresenter) {

        this.mainPresenter = mainPresenter;
    }

    @Override
    public <T> void getloginData(String newlist, CallBack<T> homeBeanCallBack) {
        RetrofitUtils.getInstance().getData(newlist,homeBeanCallBack);
    }
}
