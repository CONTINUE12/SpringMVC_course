package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//创建处理器对象
@Controller
@RequestMapping(value = "/test") //表示方法url中的公共模块名称
public class MyController {

    //请求映射，将url和方法绑定在一起
    @RequestMapping(value = "/some.do",method = RequestMethod.GET) //get方式请求
    public ModelAndView dosome() {
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是dosome方法");

        //执行视图，指定视图的完整路径
//        mv.setViewName("/WEB-INF/view/show.jsp");
        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

    @RequestMapping(value = "/other.do",method = RequestMethod.POST) //post方式请求
    public ModelAndView doother() {
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("msg","===欢迎使用springmvc做web开发===");
        mv.addObject("fun","执行的是doother方法");

        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

    @RequestMapping(value = "/first.do") //不指定具体请求方式
    public ModelAndView dofirst() {
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("msg","===欢迎使用springmvc做web开发===");
        mv.addObject("fun","执行的是dofirst方法");

        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

}
