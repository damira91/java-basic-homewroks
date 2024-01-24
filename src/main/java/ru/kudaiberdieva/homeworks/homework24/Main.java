package ru.kudaiberdieva.homeworks.homework24;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(0.6));
        appleBox.addFruit(new Apple(0.55));
        appleBox.addFruit(new Apple(0.3));
        System.out.println("Вес коробки с яблоками: " + appleBox.weight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(0.54));
        orangeBox.addFruit(new Orange(0.47));
        orangeBox.addFruit(new Orange(0.65));
        orangeBox.addFruit(new Orange(0.35));
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addFruit(new Apple(0.32));
        fruitBox.addFruit(new Orange(0.78));
        fruitBox.addFruit(new Orange(0.23));
        System.out.println("Вес коробки с фруктами: " + fruitBox.weight());

        System.out.println("Коробка с апельсинами весит столько же сколько коробка с яблоками? " + orangeBox.compare(appleBox));
        System.out.println("Коробка с фруктами весит столько же сколько коробка с яблоками? " + fruitBox.compare(appleBox));

        appleBox.putFruitsToAnotherBox(fruitBox);
        System.out.println(fruitBox.weight());
        System.out.println(appleBox.weight());
        orangeBox.putFruitsToAnotherBox(fruitBox);
        System.out.println(fruitBox.weight());
        }
    }


