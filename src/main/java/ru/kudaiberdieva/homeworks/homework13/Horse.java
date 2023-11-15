package ru.kudaiberdieva.homeworks.homework13;

public class Horse implements Transport {
     private int power;

     public int getPower(){
          return power;
     }
     public Horse(int power){
          this.power = power;
     }

     @Override
     public boolean move(int distance, Location location){
          if(location.equals(Location.SWAMP)){
               System.out.println("Horse can't ride this " + Location.SWAMP);
               return false;
          }
          if(power>=distance){
               System.out.println("Horse passed " + distance + " kilometres" + location);
               power-=distance;
               return true;
          } else{
               System.out.println("Horse can't ride because is tired");
               return false;
          }
     }
}
