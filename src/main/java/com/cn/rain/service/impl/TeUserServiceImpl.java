package com.cn.rain.service.impl;

import com.cn.rain.dao.TeUserManager;
import com.cn.rain.pojo.TeUser;
import com.cn.rain.service.TeUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rain on 2018/1/17.
 */
@Service
@Slf4j
public class TeUserServiceImpl implements TeUserService {
    @Autowired
    private TeUserManager teUserManager;

    public TeUser queryTeUserById(TeUser teUser) {
        return teUserManager.queryTeUserById(teUser);
    }
}
