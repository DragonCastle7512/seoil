package student.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Grade {
    private int gradeId;
    private int studentId;  // 외래 키
    private String subject;
    private int score;
}