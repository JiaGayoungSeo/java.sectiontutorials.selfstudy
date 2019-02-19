package com.sectiontutorials.Interface;

public abstract class AbstractClass { //Abstract class: Not be able to be instanced
    public void methodOne(){
        System.out.println ( "method one" );
    }

    /*
    Abstract method: Even though it is in a class, the method is not deliberately implemented.
     */
    public abstract void methodTwo();
}
