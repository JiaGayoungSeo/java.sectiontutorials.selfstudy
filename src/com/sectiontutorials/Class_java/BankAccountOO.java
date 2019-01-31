package com.sectiontutorials.Class_java;

class BankAccount{
    int balance =0;
    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println ( "잔액: "+balance );
        return balance;
    }
}


public class BankAccountOO {


    public static void main(String[] args){

        BankAccount park = new BankAccount ();
        BankAccount yoon = new BankAccount ();

        park.deposit ( 20000 );
        yoon.deposit ( 30000 );

        park.withdraw ( 5000 );
        yoon.withdraw ( 8000 );

        park.checkMyBalance ();
        yoon.checkMyBalance ();

    }


}
