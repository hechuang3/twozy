package com.example.day02_zytwo.contract;

import com.example.day02_zytwo.base.BaseView;
import com.example.day02_zytwo.bean.HomeBean;
import com.example.day02_zytwo.utils.net.CallBack;

public class MainContract {
    public interface MainView extends BaseView {

        void onSuceess(HomeBean homeBean);

    }
    public interface MainPresenter{

        void getData();

    }
    public interface MainModel{

        <T>void getloginData(String newlist, CallBack<T> homeBeanCallBack);

    }
}
