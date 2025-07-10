package student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import student.DTO.*;
import student.service.StudentService;

@Controller
//@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/students")
    public String students(Model model) {
        List<Student> students = studentService.getStudentsWithGrades();
        model.addAttribute("students", students);
        System.out.println(students);
        return "studentList"; // studentList.jsp 또는 studentList.html
    }
}