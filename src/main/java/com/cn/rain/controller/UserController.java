package com.cn.rain.controller;

import com.cn.rain.pojo.TeUser;
import com.cn.rain.service.TeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rain on 2018/1/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TeUserService teUserService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request,Model model){
        TeUser user = new TeUser();
        List<TeUser> teUserList = teUserService.queryTeUserList(user);
        model.addAttribute("teUserList", teUserList);
        return "userList";
    }
}
