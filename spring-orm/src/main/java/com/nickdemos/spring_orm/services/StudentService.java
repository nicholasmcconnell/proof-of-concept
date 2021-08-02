package com.nickdemos.spring_orm.services;

import com.nickdemos.spring_orm.models.Student;
import com.nickdemos.spring_orm.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

//    private StudentRepository studentRepo;
//
//    @Autowired
//    public StudentService(StudentRepository studentRepo){
//        this.studentRepo = studentRepo;
//    }
//
//    @Transactional
//    public List<Student> getAllStudents(){
//        return studentRepo.findAllStudents();
//    }
}
