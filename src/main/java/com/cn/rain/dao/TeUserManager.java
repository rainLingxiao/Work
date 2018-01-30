package com.cn.rain.dao;

import com.cn.rain.dao.innerservice.InnerTeUserService;
import com.cn.rain.pojo.TeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional(readOnly = true, isolation = Isolation.DEFAULT)
    public TeUser queryTeUserById(TeUser teUser){
        return innerTeUserService.queryTeUserById(teUser);
    }

    /*
     *  获取用户信息列表
     */
    @Transactional(readOnly = true, isolation = Isolation.DEFAULT)
    public List<TeUser> queryTeUserList(TeUser teUser){
        return innerTeUserService.queryTeUserList(teUser);
    }
}
