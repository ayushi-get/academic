package com.example.HealFitNest.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "AdminStudentInfo")

public class AdminStudentInfo {
    @Id
    private String studentId;
    private String firstName ;
    private String lastName ;
    private String year;
    private String email;
}
