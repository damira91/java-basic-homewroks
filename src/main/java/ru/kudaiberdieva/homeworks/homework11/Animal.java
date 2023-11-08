package ru.kudaiberdieva.homeworks.homework11;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int stamina;
    protected int runCosts;
    protected boolean isTired;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getRunSpeed(){
        return runSpeed;
    }
    public void setRunSpeed(int runSpeed){
        this.runSpeed = runSpeed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getRunCosts() {
        return runCosts;
    }

    public void setRunCosts(int runCosts) {
        this.runCosts = runCosts;
    }
    public boolean isTired(){
        return isTired;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }

    public int run(int distance){

       int time = distance/runSpeed;
       if(stamina >= runCosts*distance){
           stamina -=runCosts*distance;
           return time;
                  }
       isTired = true;
       return -1;
    }

    public void info(){
        System.out.println("Name: " + name + "\n" + "Running speed: " + runSpeed + " metres per second"+ "\n" +
                "Stamina: " + stamina + " conventional units" + "\n" + "Costs for running: " + runCosts + " units");

    }


}