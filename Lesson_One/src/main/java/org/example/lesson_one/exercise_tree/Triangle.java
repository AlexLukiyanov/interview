package org.example.lesson_one.exercise_tree;

public class Triangle extends Figure {

    private int sideOne;
    private int sideTwo;
    private int sideTree;

    public Triangle(String name, int sideOne, int sideTwo, int sideTree) {
        super(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideTree = sideTree;
    }

    @Override
    public void figureNameAndParameters() {
        System.out.println(findName() + "Параметры " + " Сторона 1 = " + sideOne + " Сторона 2 = " + sideTwo + " Сторона 3 = " + sideTree);
    }
}
