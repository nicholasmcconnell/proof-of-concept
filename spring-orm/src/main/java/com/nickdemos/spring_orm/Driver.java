package com.nickdemos.spring_orm;

import com.nickdemos.spring_orm.config.AppConfig;
import com.nickdemos.spring_orm.models.Student;
import com.nickdemos.spring_orm.repos.StudentRepository;
import javassist.bytecode.ExceptionsAttribute;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Driver {

    public static void main(String[] args){
        try(AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)){

            StudentRepository studentRepo = container.getBean(StudentRepository.class);

            List<Student> allStudents = studentRepo.findAllStudents();
            System.out.println(allStudents);

            Student me = studentRepo.findStudentByEmail("wsingleton@revature.com");
            System.out.println(me);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
