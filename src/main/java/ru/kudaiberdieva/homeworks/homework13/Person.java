package ru.kudaiberdieva.homeworks.homework13;

public class Person {
    private final String name;
    private Transport currentTransport;
    private int riderEnergy;
    private boolean isSitting;

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
    public void getInTransport(Transport transport){
        if(currentTransport == null){
            currentTransport = transport;
            System.out.println(name + " got in: " + transport.getClass().getSimpleName());
        }else {
            System.out.println(name + " is already sitting in: " +transport.getClass().getSimpleName());
        }
    }

    public void decreaseEnergy(int distance){

        riderEnergy -=distance;
    }
    public void ride(int distance,Location location){

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
