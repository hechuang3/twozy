package com.example.day02_zytwo.presenter;

import com.example.day02_zytwo.base.BasePresenter;
import com.example.day02_zytwo.bean.HomeBean;
import com.example.day02_zytwo.contract.MainContract;
import com.example.day02_zytwo.model.MainModel;
import com.example.day02_zytwo.utils.net.CallBack;
import com.example.day02_zytwo.utils.net.URlConstant;
import com.example.day02_zytwo.view.MainActivity;

public class MainPresenter extends BasePresenter<MainContract.MainView> implements MainContract.MainPresenter {


    private MainContract.MainModel mainModel;

    public MainPresenter(MainContract.MainView mainView) {

            mainModel=new MainModel(this);
    }

    @Override
    public void getData() {
        mainModel.getloginData(URlConstant.NEWLIST, new CallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean homeBean) {
                iView.onSuceess(homeBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }
}
