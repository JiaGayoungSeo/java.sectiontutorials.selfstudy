package com.sectiontutorials.Composition_BurgerSet.beverage;

public class Coke {
    private int price;
    private String description;

    public Coke(int price, String description){
        this.price = price;
        this.description = description;
    }

    public Coke(int price){
        this(price,"best selling beverage in 2018");
    }

    public Coke(String description){
        this(1100,description);
    }

    public Coke(){
        this(1100,"best selling beverage in 2018");
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }
}
