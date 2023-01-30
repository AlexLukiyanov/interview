package org.example.lesson_one.exercise_tree;

public class Square extends Figure {

    private int length;
    private int width;


    public Square(String name, int length, int width) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public void figureNameAndParameters() {

        System.out.println(findName() + "Параметры: " + " Сторона 1 = " + this.length + " Сторона 2 = " + this.width);
    }
}


