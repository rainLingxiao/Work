package com.cn.rain.dao;

import com.cn.rain.dao.innerservice.InnerCacheLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: lingxiao
 * Date: 2018/1/29
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
@Component
public class CacheLocalManager {

    @Autowired
    private InnerCacheLoaderService innerCacheLoaderService;

    public void loadCache(){
        innerCacheLoaderService.loadCache();
    }
}
