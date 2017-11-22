package com.bblink.data.transfer.model;

/**
 * Created by apple on 2017/7/20.
 */
public enum Level {
    INFO(1),WARN(2),ERROR(3);


    private int value;

    Level(int value){
        this.value = value;
    }
}
