package com.mace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/3 9:30 下午
 * @email: zxh_1633@163.com
 *
 * @Controller 标注这是一个后端控制器
 * @RequestMapping("/base") 接口路径匹配
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello world!";
    }

}
