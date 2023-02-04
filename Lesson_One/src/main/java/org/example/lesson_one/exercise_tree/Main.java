package org.example.lesson_one.exercise_tree;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Square square = new Square("Прямоугольник", 5, 4);
        square.figureNameAndParameters();

        Triangle triangle = new Triangle("Треугольник", 3,4,10);
        triangle.figureNameAndParameters();

        Circle circle = new Circle("Окружность", 10);
        circle.figureNameAndParameters();

    }

}
