package com.sharpness.pformofsupplier.controller;

import com.sharpness.pformofsupplier.domain.User;
import com.sharpness.pformofsupplier.result.Result;
import com.sharpness.pformofsupplier.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: supplier_platform
 * @description: 基础控制类
 * @author: Charles
 * @create: 2019-10-02 22:07
 **/
@Controller
@RequestMapping("/base")
public class SampleController {
    @Autowired
    UserService userService;

    @RequestMapping("/thymeleaf")
    public  String thymeleaf(Model model)
    {
        //添加变量
        model.addAttribute("name","Charles");
        return  "hello";
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public Result<User> dbGet()
    {
        User user=userService.getById(1);
        return  Result.success(user);
    }
}