package ru.kudaiberdieva.homeworks.homework20;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        double[] doubleArray = new double[100000000];
        long time = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            fillArraySegment(doubleArray, 0, 25);
        });
        Thread thread2 = new Thread(() -> {
            fillArraySegment(doubleArray, 26, 50);
        });
        Thread thread3 = new Thread(() -> {
            fillArraySegment(doubleArray, 51, 75);

        });
        Thread thread4 = new Thread(() -> {
            fillArraySegment(doubleArray, 76, 100);
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread4.join();
        thread3.join();
        System.out.println((System.currentTimeMillis() - time));
    }

    public static double[] fillArraySegment(double[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 > array.length || index1 > index2) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        for (int i = index1; i < index2; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }

}
