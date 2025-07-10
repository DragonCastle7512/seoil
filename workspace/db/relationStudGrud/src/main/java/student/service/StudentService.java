package student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.DTO.*;
import student.repository.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
    private StudentMapper studentMapper;


    public List<Student> getStudentsWithGrades() {
        List<Student> students = studentMapper.getAllStudents();
        System.out.println(students);
        for (Student student : students) {
            List<Grade> grades = studentMapper.getGradesByStudentId(student.getStudentId());
            student.setGrades(grades);
        }
        return students;
    }
}
