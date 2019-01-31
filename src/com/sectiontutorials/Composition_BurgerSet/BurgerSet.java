package com.sectiontutorials.Composition_BurgerSet;


import com.sectiontutorials.Composition_BurgerSet.Burger.BigRibBurger;
import com.sectiontutorials.Composition_BurgerSet.Snack.FrenchFry;
import com.sectiontutorials.Composition_BurgerSet.beverage.Coke;

public class BurgerSet {

    //BigRibBurger 클래스에서 불러옴
    private BigRibBurger burger;
    //Coke 클래스에서 불러옴
    private Coke coke;
    //Snack 클래스에서 불러옴
    private FrenchFry fried;

    //버거세트 구성하기
    public BurgerSet(BigRibBurger burger,Coke coke,FrenchFry fried){
        this.burger = burger;
        this.coke = coke;
        this.fried = fried;
    }

    public int getPrice(){
        return burger.getPrice ()+coke.getPrice ()+fried.getPrice ();
    }

    public String getDescription(){
        //description 합치기
        StringBuffer sb = new StringBuffer (  );
        sb.append ( burger.getDescription () ).append ( "," );
        sb.append ( coke.getDescription () ).append ( "," );
        sb.append ( fried.getDescription () ).append ( "," );
        return sb.toString ();
    }

    public static void main(String[] args){
        BurgerSet myBurgerSet = new BurgerSet (new BigRibBurger ( ), new Coke (  ), new FrenchFry ()  );
        System.out.println("The price is "+ myBurgerSet.getPrice ());
        System.out.println(myBurgerSet.getDescription ());
    }

}
