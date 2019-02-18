package com.sectiontutorials.Interface;
public class Interface {

    /*
    abtract method doesn't have body.
    Name, return type, parameter
    cannot create instances
    can declare reference variable
     */

    interface Printerable{
        void print(String doc); //interface, default is public
    }

    interface Printable{

        //상수(constant) 선언시 public static final 는 자동으로 설정된다
        int PAPER_WIDTH = 70;
        int PATER_HEIGHT = 120;
        void print(String doc);
    }
    // Interface Inheritance
    interface ColorPrintable extends Printable{
        void printCMYK(String doc);
    }

    //implements 구현하다--> Interface 안에 abstract method를 직접 정의(완성)하겠다.
    class Printer implements Printable{
        public void print(String doc){
            System.out.println ( doc );
        }
        //inferfaces can delcare reference variables
        Printable printable = new Printable () {
            @Override
            public void print(String doc) {
                System.out.println ( "Print start" );
            }
        };

    }

    class Prn909Drv implements ColorPrintable{
        @Override
        public void printCMYK(String doc) {
            System.out.println ( "CMYK ver" );
        }

        @Override
        public void print(String doc) {
            System.out.println ( "Black and white printing" );
        }
    }

}
