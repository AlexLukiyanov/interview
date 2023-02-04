package org.example.lesson_one.lesson_tree.exercise_two;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Counter {

    AtomicInteger counter;

    public Counter() {
        counter = new AtomicInteger();
    }

    public void increment() {
        counter.incrementAndGet();
    }

}
