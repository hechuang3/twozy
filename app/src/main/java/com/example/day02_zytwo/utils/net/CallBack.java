package com.example.day02_zytwo.utils.net;

public interface CallBack<T> {
    void onSuccess(T t);
    void onFail(String err);
}
