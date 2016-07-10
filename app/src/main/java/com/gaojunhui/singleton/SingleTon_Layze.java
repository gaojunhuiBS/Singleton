package com.gaojunhui.singleton;

/**
 * Created by Administrator on 2016/7/10.
 */
public class SingleTon_Layze {
    private SingleTon_Layze(){};
    private static SingleTon_Layze instance=null;
    public static SingleTon_Layze getInstance(){
        if (instance==null){
         instance=new SingleTon_Layze();
        }
        return instance;
    }
}
