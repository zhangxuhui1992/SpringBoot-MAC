package com.mace.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangxuhui
 * @Date: 2021/1/14 8:43 下午
 * @email: zxh_1633@163.com
 */
@RestController
@RequestMapping("/web")
public class WebController {

    //@RequestMapping(value = "/uesr",method = RequestMethod.POST)
    @PostMapping("/uesr")
    public String add(){
        return "post : add ";
    }

    @RequestMapping(value = "/uesr",method = RequestMethod.DELETE)
    public String delete(){
        return "delete : add ";
    }

    @RequestMapping(value = "/uesr",method = RequestMethod.GET)
    public String getuser(){
        return "get : add ";
    }

    /**
     * /web/to/test;we=123
     * 矩阵变量的获取方式
     * 默认不开起，需要手动配置
     * @param test
     * @param qe
     * @return
     */
    @ResponseBody
    @RequestMapping("/to/{test}")
    public Map getMap(@PathVariable("test")String test,@MatrixVariable("qe")String qe){
        Map map = new HashMap();
        return map;
    }


}
