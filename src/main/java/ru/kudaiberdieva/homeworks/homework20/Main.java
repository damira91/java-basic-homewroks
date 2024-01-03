package ru.kudaiberdieva.homeworks.homework20;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[100000000];
        long time = System.currentTimeMillis();
        createFillArray(array);
        System.out.println((System.currentTimeMillis() - time));
    }

    public static double[] createFillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }
}

