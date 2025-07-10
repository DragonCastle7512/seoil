package student.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import student.DTO.Grade;
import student.DTO.Student;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudents();
    List<Grade> getGradesByStudentId(int studentId);
}