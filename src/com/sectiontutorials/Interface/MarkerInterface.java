package com.sectiontutorials.Interface;

public class MarkerInterface {
    interface Upper{} //Marker interface - doesn't have its body
    interface Lower{} //Marker interface

    interface Printable {
        String getContest();
    }

    class Report implements Printable, Upper{
        String cons;

        Report(String cons){
            this.cons = cons;
        }

        public String getContest(){
            return cons;
        }

        //reference type : Printable. Parameter should be an instance of class that implements Printable interface
        public void printContests(Printable doc){
            if(doc instanceof Upper){
                System.out.println ( (doc.getContest ().toUpperCase ()) );
            }
            else if(doc instanceof Lower){
                System.out.println ( (doc.getContest ()).toLowerCase () );
            }
            else {
                System.out.println ( doc.getContest () );
            }
        }
    }
}
