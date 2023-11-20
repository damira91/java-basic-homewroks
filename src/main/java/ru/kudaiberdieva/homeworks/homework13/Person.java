package ru.kudaiberdieva.homeworks.homework13;

public class Person {
    private final String name;
    private Transport currentTransport;
    private int riderEnergy;

    public Person(String name, int riderEnergy){
        this.name=name;
        this.riderEnergy = riderEnergy;
    }


    public int getRiderEnergy() {
        return riderEnergy;
    }

    public Transport getCurrentTransport() {

        return currentTransport;
    }


    public void setCurrentTransport(Transport transport){

        this.currentTransport = transport;
    }
    public void decreaseEnergy(int distance){
        riderEnergy -=distance;
    }
    public void ride(Transport transport, int distance,Location location){

        if(currentTransport!=null){
            currentTransport.move(distance, location);
        }else{
            System.out.println("Going by foot " + distance + " kilometres in " + location);
        }
    }
    public void getOffCurrentTransport(){
        this.currentTransport = null;
    }
}
