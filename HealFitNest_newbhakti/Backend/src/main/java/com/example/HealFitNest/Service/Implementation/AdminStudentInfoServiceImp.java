package com.example.HealFitNest.Service.Implementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.HealFitNest.Model.AdminStudentInfo;
import com.example.HealFitNest.Repository.AdminStudentInfoRepo;
import com.example.HealFitNest.Service.AdminStudentInfoService;
@Service
public class AdminStudentInfoServiceImp implements AdminStudentInfoService {
    @Autowired
    private AdminStudentInfoRepo adminStudentInfoRepo;


    @Override
    public AdminStudentInfo addStudent(AdminStudentInfo studentInfo) {
        AdminStudentInfo studentInfo1=new AdminStudentInfo();
        studentInfo1.setFirstName(studentInfo.getFirstName());
        studentInfo1.setLastName(studentInfo.getLastName());
        studentInfo1.setEmail(studentInfo.getEmail());
        studentInfo1.setYear(studentInfo.getYear());
        adminStudentInfoRepo.save(studentInfo1);
        return studentInfo1;
    }
}
