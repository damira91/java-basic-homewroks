package ru.kudaiberdieva.homeworks.homework26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadPool {

    private static final Object mon = new Object();
    private static String a;

    public static void main(String[] args) {
        ExecutorService exeServ = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            exeServ.execute(() -> {
                printA();
                printB();
                printC();
            });
        }
        exeServ.shutdown();
    }

    public static void printA() {
        synchronized (mon) {
            a = " ";
            try {
                while (a.equals("A")) {
                    mon.wait();
                }
                System.out.print("A");
                mon.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB() {
        synchronized (mon) {
            a = " ";
            try {
                while (a.equals("B")) {
                    mon.wait();
                }
                System.out.print("B");
                mon.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printC() {
        synchronized (mon) {
            a = " ";
            try {
                while (a.equals("C")) {
                    mon.wait();
                }
                System.out.print("C");
                mon.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
