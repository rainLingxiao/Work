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
@Component
public class CacheInitUtil implements ApplicationListener{
    // 是否已执行  执行后修改为true 避免多次执行
    private static boolean isStart = false;
    @Autowired
    private CacheLocalManager cacheLocdalManager;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (!isStart) {
            isStart = true;
            log.info("=======this is begin=======");
            cacheLocdalManager.loadCache();
            log.info("=======this is over=======");
        }
    }
}
