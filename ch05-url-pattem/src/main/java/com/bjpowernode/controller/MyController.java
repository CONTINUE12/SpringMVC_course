package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//创建处理器对象
@Controller
public class MyController {

    //逐个接受参数,请求参数名必须和方法形参名一致，否则会报错
    //请求映射，将url和方法绑定在一起
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(String name, Integer age) {
        System.out.println("name:" + name +", age" + age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
}
