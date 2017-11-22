package com.bblink.data.transfer.service.impl;

import com.bblink.data.transfer.mapper.LogMapper;
import com.bblink.data.transfer.model.Log;
import com.bblink.data.transfer.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2017/7/20.
 */
@Service
public class LogServiceImpl implements LogService {


    @Autowired
    private LogMapper logMapper;

    @Override
    public int insert(Log log) {
        return logMapper.insert(log);
    }
}
