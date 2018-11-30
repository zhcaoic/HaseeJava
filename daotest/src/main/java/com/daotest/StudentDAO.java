package com.daotest;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {

    Student selectByName(@Param("studentName") String studentName);

    List<Student> selectALL();

    void insertNewStudnet(Student newStudent);

}
