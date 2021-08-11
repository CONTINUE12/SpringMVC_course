package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyUserException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//创建处理器对象
@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(String name,Integer age) throws MyUserException {
        //处理some.do请求
        ModelAndView mv = new ModelAndView();

        if (!"zs".equals(name)) {
            throw new NameException("姓名不正确！！！");
        }

        if (age == null || age > 80) {
            throw new AgeException("年龄比较大！！！");
        }

        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //显式的转发，可转发至WEB-INFZHI之外的路径
        mv.setViewName("show");

        //返回mv
        return mv;
    }
}
