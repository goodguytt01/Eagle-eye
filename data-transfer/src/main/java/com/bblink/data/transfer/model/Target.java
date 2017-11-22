package com.bblink.data.transfer.model;

/**
 * Created by apple on 2017/7/20.
 */
public enum  Target {
    LOG(1),ALERT(2),UNKNOW(3);

    private int value;

    Target(int value){
        this.value = value;
    }
}
