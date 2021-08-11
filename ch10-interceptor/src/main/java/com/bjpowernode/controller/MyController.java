package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//创建处理器对象
@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(String name,Integer age){
        System.out.println("=====执行MyController中的doSome方法=====");
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //显式的转发，可转发至WEB-INFZHI之外的路径
        mv.setViewName("show");

        //返回mv
        return mv;
    }
}
