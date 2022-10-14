package com.example.HealFitNest.Controller;
import java.util.List;

import com.example.HealFitNest.Repository.AdminStudentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.HealFitNest.Model.AdminStudentInfo;
import com.example.HealFitNest.Service.AdminStudentInfoService;

@RestController
@RequestMapping("/adm/v2")

public class AdminStudentInfoController {
    @Autowired
    private AdminStudentInfoRepo adminStudentInfoRepo;

    @Autowired
    private AdminStudentInfoService adminStduentInfoService;

    // add new student
    @PostMapping("/admin/studentinfo/addstudent")
    public ResponseEntity<?> addStduent(@RequestBody AdminStudentInfo studentInfo){
        adminStduentInfoService.addStudent(studentInfo);
        return new ResponseEntity<>(studentInfo,HttpStatus.CREATED);
    }


}
