package org.example.lesson_one.lesson_tree.exercise_one;

public class PingPong  implements Runnable {

    private Object object;
    private String name;

    public PingPong(Object object, String name) {
        this.object = object;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (object) {
            while (true) {
                System.out.println(name);

                try {
                    //System.out.println("зашли в первый трай");
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                //System.out.println("вышли из первого трая");
                object.notify();

                try {
                    //System.out.println("зашли в второй трай");
                    object.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //System.out.println("вышли в второй трай");
            }
        }
    }
}
