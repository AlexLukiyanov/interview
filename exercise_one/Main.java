package org.example.lesson_one.lesson_tree.exercise_one;

import org.example.lesson_one.lesson_tree.exercise_one.PingPong;

public class Main {

    public static void main(String[] args) {

        Object object = new Object();
        Thread ping = new Thread((Runnable) new PingPong(object,"Ping"));
        Thread pong = new Thread((Runnable) new PingPong(object, "Pong"));
        //System.out.println("Вызов ping");
        ping.start();
        //System.out.println("Вызов pong");
        pong.start();
    }
}
