package com.bblink.data.transfer.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by apple on 2017/7/20.
 */
@Data
public class Log {
    private String token;

    private Level level;

    private Target target;

    private Date createTime;
}
