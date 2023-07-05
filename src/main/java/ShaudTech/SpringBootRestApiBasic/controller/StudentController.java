package ShaudTech.SpringBootRestApiBasic.controller;

import ShaudTech.SpringBootRestApiBasic.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent()
    {
        Student student = new Student(1, "Dante", "watson");
        return student;
    }
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Dante", "Watson"));
        students.add(new Student(2,"john", "cena"));
        students.add(new Student(3,"mike", "jones"));
        students.add(new Student(4,"tom", "petty"));
        students.add(new Student(5,"lara", "croft"));
        return students;
    }
}
