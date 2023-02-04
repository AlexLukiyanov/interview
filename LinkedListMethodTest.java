package org.example.lesson_one.lesson_two;

import java.util.LinkedList;

public class LinkedListMethodTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        System.out.println(list.stream().toList());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("Zero");
        list.addLast("Four");
        System.out.println(list.stream().toList());
        list.pollFirst();
        list.pollLast();
        System.out.println(list.stream().toList());

        list.add(1,"For");
        System.out.println(list.stream().toList());
    }
}
