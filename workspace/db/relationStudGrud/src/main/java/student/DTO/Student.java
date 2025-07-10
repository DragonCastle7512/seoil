package student.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {
    private int studentId;
    private String name;
    private String major;
    private List<Grade> grades;  // 1:N 관계
}
