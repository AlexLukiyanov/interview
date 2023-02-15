package org.example.lesson_one.exercise_five;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private Integer mark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Student(Long id, String name, Integer mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return String.format("Students [id = %d, name = %s, score = %d]", id, name, mark);
    }
}
