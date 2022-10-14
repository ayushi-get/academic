package com.example.HealFitNest.Repository;

import com.example.HealFitNest.Model.AdminStudentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface AdminStudentInfoRepo extends MongoRepository<AdminStudentInfo,String>{

}
