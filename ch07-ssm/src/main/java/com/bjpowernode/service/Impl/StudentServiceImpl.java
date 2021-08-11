package com.bjpowernode.service.Impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}
