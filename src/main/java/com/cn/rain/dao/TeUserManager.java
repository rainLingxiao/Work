package com.cn.rain.dao;

import com.cn.rain.dao.innerservice.InnerTeUserService;
import com.cn.rain.pojo.TeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rain on 2018/1/16.
 */
@Component
public class TeUserManager {
    @Autowired
    private InnerTeUserService innerTeUserService;

    /*
    * 获取用户信息
    */
    public TeUser queryTeUserById(TeUser teUser){
        return innerTeUserService.queryTeUserById(teUser);
    }
}