package com.sectiontutorials.Composition_BurgerSet.Snack;

public class FrenchFry {
    private int price;
    private String description;

    public FrenchFry(int price, String description){
        this.price = price;
        this.description = description;
    }

    public FrenchFry(int price){
        this(price,"best selling snack in 2018");
    }

    public FrenchFry(String description){
        this(800,description);
    }

    public FrenchFry(){
        this(800,"best selling snack in 2018");
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

}
