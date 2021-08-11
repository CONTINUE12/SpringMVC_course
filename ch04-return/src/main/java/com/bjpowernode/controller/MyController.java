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
import java.util.HashMap;
import java.util.List;

//创建处理器对象
@Controller
public class MyController {

    //逐个接受参数,请求参数名必须和方法形参名一致，否则会报错
    //请求映射，将url和方法绑定在一起
    //返回值类型String表示返回的是视图
    @RequestMapping(value = "/return-view.do")
    public String doreturnview(HttpServletRequest request, String name, Integer age) {
        System.out.println("name:" + name +", age" + age);
        //手动添加测试数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        //逻辑视图名称，项目中配置了视图解析器
        //框架对视图执行forward转发操作
        return "show";
    }

    //处理器方法返回void，相应ajax请求
    @RequestMapping(value = "/returnVoid-ajax.do")
    public void doreturnVoidAjax(HttpServletResponse response, String name, Integer age) throws IOException {
        System.out.println("name:" + name +", age" + age);
        //处理ajax，使用json做数据格式
        //假设service调用完成了， 使用Student表示处理结果
        Student student  = new Student();
        student.setName("张飞");
        student.setAge(28);

        String json = "";
        //把结果的对象转为json格式的数据
        if( student != null){
            ObjectMapper om  = new ObjectMapper();
            json  = om.writeValueAsString(student);
            System.out.println("student转换的json===="+json);
        }

        //输出数据，响应ajax的请求
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw  = response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }

    // 处理器方法返回Student对象，框架把数据转换为json格式
    @RequestMapping(value = "/returnStudentJson.do")
    @ResponseBody //注解作用为：将object对象转换为json数据格式
    public Student doreturnStudentJson(String name, Integer age) {
        //创建Student对象作为返回值
        Student student = new Student();
        student.setName("李四同学");
        student.setAge(20);
        return student;
    }

    // 处理器方法返回Student数组，框架把数据转换为json格式
    @RequestMapping(value = "/returnStudentJsonArray.do")
    @ResponseBody //注解作用为：将object对象转换为json数据格式
    public List<Student> doreturnStudentJsonArray(String name, Integer age) {
        List<Student> studentList = new ArrayList<>();
        //创建Student对象作为返回值
        Student student = new Student();
        student.setName("张三同学");
        student.setAge(20);
        studentList.add(student);

        student = new Student();
        student.setName("李四同学");
        student.setAge(20);
        studentList.add(student);

        return studentList;
    }

    //返回值类型为String，若加上注解ResponseBody则表示返回数据
    @RequestMapping(value = "/stringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name, Integer age) {
        return "hello springmvc 返回对象，表示文本数据";
    }
}
