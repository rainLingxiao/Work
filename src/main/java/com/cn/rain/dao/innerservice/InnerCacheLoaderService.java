package com.cn.rain.dao.innerservice;

import com.cn.rain.mapping.TeUserMapper;
import com.cn.rain.pojo.TeUser;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lingxiao
 * Date: 2018/1/29
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
@Component
@Slf4j
public class InnerCacheLoaderService {
//    @Autowired
//    private RedisComponent redisComponent;
    @Autowired(required = false)
    private ThreadPoolTaskExecutor makeCardThreadPool;
    @Autowired
    private TeUserMapper teUserMapper;


    public void loadCache() {
        System.out.println("start of loadcache");
        Runnable r = () -> {
            // 当前时间毫秒数作为版本号
            String version = String.valueOf(System.currentTimeMillis());
            Map<String, String> nameAndCode = Maps.newHashMap();
            Map<String, String> merchantNameMap = Maps.newHashMap();
            nameAndCode.put("version", version);
            merchantNameMap.put("version", version);
            List<TeUser> users = teUserMapper.queryTeUserList(new TeUser());
            for (TeUser user : users) {
                merchantNameMap.put(user.getId(), user.getRname());
            }
            //删除原有数据
            log.info("移除姓名-姓名缓存！");
//            redisComponent.removeRedis("cache_user");
            log.info("存储姓名-姓名缓存！");
//            redisComponent.setRedis("cache_user", merchantNameMap);
            log.info("加载客户缓存数据结束！");
        };
        makeCardThreadPool.execute(r);
    }


//    public void loadCache(){
//        Runnable r = () -> {
//            TeUser teUser = new TeUser();
//            Map<String, String> userMap = Maps.newHashMap();
//            List<TeUser> userList = teUserMapper.queryTeUserList(teUser);
//            for (TeUser user : userList) {
//                userMap.put(user.getId() , user.getRname());
//            }
//            redisComponent.setRedis("userMap",userMap);
//        };
//        makeCardThreadPool.execute(r);
//    }
}
