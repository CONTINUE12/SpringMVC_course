package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//创建处理器对象
@Controller
public class MyController {

    //逐个接受参数,请求参数名必须和方法形参名一致，否则会报错
    //请求映射，将url和方法绑定在一起
    @RequestMapping(value = "/receivepropertity.do")
    public ModelAndView doreceivepropertity(String name,Integer age) {
        System.out.println("name:" + name +", age" + age);
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

    /*
    * 当请求参数名和方法形参名不一致,需要使用@requestparam注解
    *                     属性： 1.value属性需要在形参前使用，用于指定请求参数对应的形参
    *                           2.required属性为布尔值，若为true，则请求时参数不能为空
    * */
    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receiveparam(@RequestParam(value = "rname",required = false) String name,
                                     @RequestParam(value = "rage",required = false) Integer age) {
        System.out.println("name:" + name +", age" + age);
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveobject(Student myStudent) {
        System.out.println("name:" + myStudent.getName() +", age" + myStudent.getAge());
        //处理some.do请求
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在请求的最后把数据放入到request作用域
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);

        //当配置了视图解析器后，可以直接指定文件名指定视图
        mv.setViewName("show");

        //返回mv
        return mv;
    }

}
