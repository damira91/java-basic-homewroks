package ru.kudaiberdieva.homeworks.homework13;

public class Bicycle implements Transport {

    private int riderEnergy;

    public int getRiderEnergy(){
        return riderEnergy;
    }

    public Bicycle(int riderEnergy){
        this.riderEnergy = riderEnergy;
    }
    @Override
    public boolean move(int distance, Location location){
        if(location.equals(Location.SWAMP)){
            System.out.println("Bicycle can't ride " + Location.SWAMP);
            return false;
        }
        if(riderEnergy>=distance){
            System.out.println("Bicycle passed " + distance);
            riderEnergy-=distance;
            return true;
        } else {
            System.out.println("Rider is tired and can't move further");
            return false;
        }
    }
}
