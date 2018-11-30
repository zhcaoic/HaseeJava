package com.daotest;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class StudentService {


    @Resource StudentDAO studentDAO;

    public Student getStudentByName(String studentName) {

        return studentDAO.selectByName(studentName);
    }

    public List<Student> getStudents() {

        return studentDAO.selectALL();
    }


    public void registerService(String studentId, String studentName, String studentAddress) {
        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName(studentName);
        student.setStudentAddress(studentAddress);
        student.setCreateTime(new Date());
        student.setUpdateTime(new Date());

        studentDAO.insertNewStudnet(student);
    }

}
