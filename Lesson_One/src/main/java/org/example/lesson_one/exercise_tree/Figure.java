package org.example.lesson_one.exercise_tree;

public class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public void figureNameAndParameters() {
        System.out.println(findName());
    }

    public String findName() {
        return "Название фигуры: " + name + " ";
    }


}




