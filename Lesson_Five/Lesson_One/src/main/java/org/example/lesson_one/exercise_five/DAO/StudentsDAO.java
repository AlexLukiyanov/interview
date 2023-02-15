package org.example.lesson_one.exercise_five.DAO;


import org.example.lesson_one.exercise_five.Student;

import java.util.List;

public interface StudentsDAO {

    Student findById (Long id);

    List<Student> findAll();

    void deleteById(Long id);
    Student saveOrUpdate(Student student);


}
