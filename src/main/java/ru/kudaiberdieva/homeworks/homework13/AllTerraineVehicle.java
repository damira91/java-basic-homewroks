package ru.kudaiberdieva.homeworks.homework13;

public class AllTerraineVehicle implements Transport {
    private int fuel;

    public int getFuel(){
        return fuel;
    }

    public AllTerraineVehicle(int fuel){
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance, Location location){
        if(fuel>=distance){
            System.out.println("All-terrain vehicle passed " + distance + " kilometres " + "in " + location);
            fuel-=distance;
            return true;
        }else{
            System.out.println("All-terrain vehicle can't ride because of lack of fuel");
            return false;
        }
    }
}
