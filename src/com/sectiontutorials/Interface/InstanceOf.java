package com.sectiontutorials.Interface;

public class InstanceOf{




interface Printable{
    void printLine(String str);
}

//SimplePrinter 가 Printable 구현
static class SimplePrinter implements Printable{
    @Override
    public void printLine(String str) {
        System.out.println ( str );
    }
}

static class MultiPrinter extends SimplePrinter{
    public void printLine(String str){
        super.printLine ( "Start of multi" );
        super.printLine ( str );
        super.printLine ( "end of multi" );
    }
}

public static void main(String[] args){
    Printable prn1 = new SimplePrinter ();
    Printable prn2 = new MultiPrinter ();

    if(prn1 instanceof Printable){
        prn1.printLine ( "This is a simple printer" );
        System.out.println (  );
    }
    if(prn2 instanceof  Printable){
        prn2.printLine ( "This is a multiple printer" );
    }
}
}