package com.gaojunhui.singleton;

/**
 * Created by Administrator on 2016/7/10.
 */
public class SingleTon_Hungry {
    private SingleTon_Hungry(){};
    private static SingleTon_Hungry instance=new SingleTon_Hungry();
    public static SingleTon_Hungry getInstance(){
        return instance;
    }
}
