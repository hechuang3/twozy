package com.example.day02_zytwo.utils.net;

public interface NetWorkInterface {
    public <T> void getData(String url,CallBack<T> callBack);
}
