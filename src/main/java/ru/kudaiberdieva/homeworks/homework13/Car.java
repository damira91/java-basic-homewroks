package ru.kudaiberdieva.homeworks.homework13;

public class Car implements Transport {
    private int fuel;

    public int getFuel(){
        return fuel;
    }
    public Car(int fuel){
        this.fuel = fuel;
    }
    @Override
    public boolean move(int distance, Location location){
        if (location.equals(Location.FOREST) || location.equals(Location.SWAMP)){
            System.out.println("Car can't ride in " + location);
            return false;
        }
        if(fuel>=distance){
            System.out.println("Car passed: " + distance + " kilometres in " + location);
            fuel-=distance;
            return true;
        } else{
            System.out.println("Car can't ride because of lack of fuel");
            return false;
        }
    }
}
