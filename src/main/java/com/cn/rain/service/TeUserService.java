package com.cn.rain.service;

import com.cn.rain.pojo.TeUser;

import java.util.List;

/**
 * Created by rain on 2018/1/17.
 */
public interface TeUserService {

    /**
     * 获取用户信息
     * @param teUser
     * @return
     */
    TeUser queryTeUserById(TeUser teUser);

    /**
     * 获取用户信息列表
     * @param teUser
     * @return
     */
    List<TeUser> queryTeUserList(TeUser teUser);
}
