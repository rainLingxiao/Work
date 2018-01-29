package com.cn.rain.util;

import com.cn.rain.dao.CacheLocalManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: lingxiao
 * Date: 2018/1/29
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@SuppressWarnings("rawtypes")
@Component
public class CacheInitUtil implements ApplicationListener{
    @Autowired
    private CacheLocalManager cacheLocdalManager;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("\\n\\n\\n_________\\n\\n this is test medo \\n\\n ________\\n\\n\\n\\n");
        cacheLocdalManager.loadCache();
    }
}
