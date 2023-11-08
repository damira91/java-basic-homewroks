package ru.kudaiberdieva.homeworks.homework11;

public class Horse extends Animal {
    private int swimSpeed;
    private int swimCosts;
    public Horse (String name, int runSpeed, int swimSpeed, int stamina, boolean isTired){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.isTired = isTired;
        this.runCosts = 1;
        this.swimCosts = 4;
    }
    public int swim(int distance){
        int time = distance/swimSpeed;
        if(stamina >= swimCosts*distance){
            stamina -=swimCosts*distance;
            return time;
        }
        isTired = true;
        return -1;
    }
    @Override
    public void info(){
        System.out.println("Name: " + name + "\n" + "Running speed: " + runSpeed + " metres per second" + "\n" +
                "Swimming speed: " + swimSpeed + " metres per second"+ "\n" + "Stamina: " + stamina + " conventional units"
                + "\n" + "Costs for running: " + runCosts + " units" + "\n" + "Costs for swimming: " + swimCosts + " units");
    }
}
