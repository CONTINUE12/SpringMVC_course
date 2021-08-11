package com.bjpowernode.vo;

//接受对象参数的一个普通类
public class Student {
    //属性名要和请求参数名一致
    private String name;
    private Integer age;

    public Student() {
        System.out.println("===接受对象参数的类的构造器===");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name:" + name);
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("age:" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
