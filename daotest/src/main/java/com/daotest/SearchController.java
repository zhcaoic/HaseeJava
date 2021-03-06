package com.daotest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SearchController {


    @Resource private StudentService studentService;

    @RequestMapping("/search/one")
    public String searchOne(@RequestParam("name") String name,
                            ModelMap modelMap) {
        Student student = studentService.getStudentByName(name);
        modelMap.addAttribute("student", student);

        return "searchone";
    }




    @RequestMapping("/search/all")
    public String searchAll(ModelMap modelMap) {
        List<Student> studentList = studentService.getStudents();
        modelMap.addAttribute("students", studentList);

        return "searchall";
    }



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("studentName") String studentName,
                           @RequestParam("studentId") String studnetId,
                           @RequestParam("studentAddress") String studentAddress) {

        studentService.registerService(studnetId, studentName, studentAddress);

        return "search";
    }


}
