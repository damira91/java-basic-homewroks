package ru.kudaiberdieva.homeworks.homework13;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }
    public Transport getCurrentTransport() {
        return currentTransport;
    }


    public void setCurrentTransport(Transport transport){
        this.currentTransport = transport;
    }
    public void ride(Transport transport, int distance,Location location){
        boolean moved = false;
        if(currentTransport!=null){
            moved = currentTransport.move(distance, location);
        } else{
            System.out.println("Going by foot " + distance + " kilometres in " + location);
        }

    }
    public void getOffCurrentTransport(){
        this.currentTransport = null;
    }
}
