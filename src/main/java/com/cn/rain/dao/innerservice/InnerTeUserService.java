package com.cn.rain.dao.innerservice;

import com.cn.rain.mapping.TeUserMapper;
import com.cn.rain.pojo.TeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rain on 2018/1/16.
 */
@Component
public class InnerTeUserService {
    @Autowired
    private TeUserMapper teUserMapper;

    /*
     * 获取用户信息
     */
    public TeUser queryTeUserById(TeUser teUser){
        return teUserMapper.selectByPrimaryKey(teUser.getId());
    }
}
