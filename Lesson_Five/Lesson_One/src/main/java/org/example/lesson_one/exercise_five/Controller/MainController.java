package org.example.lesson_one.exercise_five.Controller;

import org.example.lesson_one.exercise_five.DAO.StudentsDAOImpl;
import org.example.lesson_one.exercise_five.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StudentsDAOImpl studentsDAO;

    @PostMapping("/student/add")
    public void addStudentPost(@RequestBody Student student){
        studentsDAO.saveOrUpdate(student);
    }

    @GetMapping("/student/all")
    public List<Student> getStudent() {
        return studentsDAO.findAll();
    }

    @GetMapping("/student/delete")
    public void deleteStudent(@RequestParam Long id) {
        studentsDAO.deleteById(id);
    }
    @GetMapping
    public Student findByIdStudent(@RequestParam Long id) {
        return studentsDAO.findById(id);
    }
}
