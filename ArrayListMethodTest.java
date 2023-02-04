package org.example.lesson_one.lesson_two;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListMethodTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add(0,"Один");
        list.add(1,"Два");
        list.add(2,"Три");

        ArrayList<String> listCopy = (ArrayList<String>) list.clone();

        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        System.out.println(listCopy.toString());

        System.out.println(listCopy.contains("Два"));

        //Вывод на экран с помощью переопределения метода
        listCopy.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println(listCopy.get(1));
        System.out.println(listCopy.indexOf("Два"));


        System.out.println(listCopy.toString());
        listCopy.set(1,"Четыре");
        System.out.println(listCopy.toString());

        listCopy.remove(1);
        System.out.println(listCopy.toString());
        System.out.println(listCopy.size());

        String[] array = new String[listCopy.size()];
        listCopy.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
