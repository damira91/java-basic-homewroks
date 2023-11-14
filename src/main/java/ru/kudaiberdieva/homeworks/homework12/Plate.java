package ru.kudaiberdieva.homeworks.homework12;

public class Plate {
    private int maxFoodAmount;
    private int food;

    public Plate(int maxFoodAmount, int food){
        this.maxFoodAmount = maxFoodAmount;
        this.food = food;
    }

    public int getMaxFoodAmount(){
        return maxFoodAmount;
    }
    public int getFood(){
        return food;
    }
    public void setFood(int food){
        this.food = food;
    }
    public void add(int amount){
        if(food<=maxFoodAmount){
            food+=amount;
        }
    }
    public boolean reduce(int amount){
        if(food>=0){
            food-=amount;
            return true;
        }  else return false;
    }
    public void info(){
        if(food>=0){
        System.out.println("Amount of food: " + food);
        } else
            System.out.println("There is no food in the plate");
    }
}

