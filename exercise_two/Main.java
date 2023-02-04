package org.example.lesson_one.lesson_tree.exercise_two;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                    //System.out.println(counter.counter);
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                    //System.out.println(counter.counter);
                }
            }
        });

        Thread threadTree = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    counter.increment();
                    //System.out.println(counter.counter);
                }
            }
        });

        Long time = System.currentTimeMillis();
        threadOne.start();
        threadTwo.start();
        threadTree.start();
        threadOne.join();
        threadTwo.join();
        threadTree.join();
        //Thread.sleep(1000);
        System.out.println(counter.counter);
        //System.out.println("Finish " + (System.currentTimeMillis() - time) );
    }
}
