package com.cn.rain.mapping;

import com.cn.rain.pojo.TeUser;

import java.util.List;

public interface TeUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TeUser record);

    int insertSelective(TeUser record);

    TeUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TeUser record);

    int updateByPrimaryKey(TeUser record);

    List<TeUser> queryTeUserList(TeUser teUser);
}