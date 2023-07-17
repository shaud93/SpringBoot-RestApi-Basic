package ShaudTech.SpringBootRestApiBasic.controller;

import ShaudTech.SpringBootRestApiBasic.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @GetMapping("student")
    public Student getStudent()
    {
        Student student = new Student(1, "Dante", "watson");
        return student;
    }

    // Get List Example
    @GetMapping
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Dante", "Watson"));
        students.add(new Student(2,"john", "cena"));
        students.add(new Student(3,"mike", "jones"));
        students.add(new Student(4,"tom", "petty"));
        students.add(new Student(5,"lara", "croft"));
        return students;
    }
    // Path Variable Example
    @GetMapping("{id}/{f-name}/{l-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("f-name") String firstName,
                                       @PathVariable("l-name") String lastName){
        return new Student(studentId, firstName, lastName);
    }
    // Query/Request param Example
    // http://localhost:8080/students/query?id=1&firstName=dante&lastName=watson
    @GetMapping("query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }
    // PostMapping And RequestMapping
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student)
    {
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
    //PutMapping
    @PutMapping("{id}/update")
    public Student updateStudent (@RequestBody Student student, @PathVariable("id")int studentId)
    {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
    //DeleteMapping
    @DeleteMapping("{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId)
    {
        return "deleted";
    }
}
