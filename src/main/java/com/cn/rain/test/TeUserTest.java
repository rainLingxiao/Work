package com.cn.rain.test;

import com.cn.rain.pojo.TeUser;
import com.cn.rain.service.TeUserService;
import com.cn.rain.service.impl.TeUserServiceImpl;
import com.cn.rain.util.UtilTest;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rain on 2018/1/17.
 */
public class TeUserTest extends UtilTest{
    private Logger logger = LoggerFactory.getLogger(TeUserTest.class);
    @Autowired
    private TeUserServiceImpl teUserService;

    @Test
    public void queryTeUser(){
        TeUser teUser = new TeUser();
        teUser.setId("1");
        if (teUser == null){
            return;
        }
        TeUser result = teUserService.queryTeUserById(teUser);
        System.out.println("-------------------");
        System.out.println(result);
        System.out.println("-------------------");
//        if (!result.isSuccess()) {
//            logger.info("失败时，错误代码：" + result.getErrorCode() + "，错误原因：" + result.getErrorMsg());
//        }
//        Assert.assertEquals(true, result.isSuccess());
//        logger.info("成功" + result.getResult());
    }
}
