package org.example.lesson_one.exercise_tree;

public class Circle extends Figure {

    private int radius;


    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void figureNameAndParameters() {
        System.out.println(findName() + "Параметры: " + " Радиус = " + this.radius);
    }
}
