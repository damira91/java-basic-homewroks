package ru.kudaiberdieva.homeworks.homework13;

public class TravelApp {
    public static void main(String[] args) {
        Car car = new Car(100);
        Horse horse = new Horse(80);

        AllTerraineVehicle allTerraineVehicle = new AllTerraineVehicle(200);

        Person person = new Person("Tom",60);
        Bicycle bicycle = new Bicycle(person);
        person.setCurrentTransport(car);
        person.ride(person.getCurrentTransport(), 70, Location.PLAIN);
        person.ride(person.getCurrentTransport(), 20, Location.FOREST);
        person.getOffCurrentTransport();

        person.setCurrentTransport(bicycle);
        person.ride(person.getCurrentTransport(), 45, Location.FOREST);
        person.getOffCurrentTransport();

        person.setCurrentTransport(horse);
        person.ride(person.getCurrentTransport(), 90, Location.PLAIN);
        person.getOffCurrentTransport();

        person.setCurrentTransport(allTerraineVehicle);
        person.ride(person.getCurrentTransport(), 180, Location.SWAMP);
        person.getOffCurrentTransport();

        person.ride(person.getCurrentTransport(), 60, Location.FOREST);

        }
    }
