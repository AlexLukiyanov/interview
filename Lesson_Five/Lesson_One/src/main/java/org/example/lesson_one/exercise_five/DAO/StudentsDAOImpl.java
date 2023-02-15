package org.example.lesson_one.exercise_five.DAO;

import org.example.lesson_one.exercise_five.SessionFactoryUtils;
import org.example.lesson_one.exercise_five.Student;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Scope("prototype")
public class StudentsDAOImpl implements StudentsDAO {

    @Autowired
    private SessionFactoryUtils sessionFactoryUtils;

    public StudentsDAOImpl(SessionFactoryUtils sessionFactoryUtils){
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public Student findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public List<Student> findAll() {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            List<Student> student = session.createQuery("select s from Student s").getResultList();
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public Student saveOrUpdate(Student student) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
            return student;
        }
    }
}
